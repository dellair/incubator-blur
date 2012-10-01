  class Cluster < ActiveRecord::Base
  belongs_to :zookeeper
  has_many :blur_shards, :dependent => :destroy
  has_many :blur_tables, :dependent => :destroy, :order => 'table_name'

  attr_accessor :can_update

  def as_json(options={})
    serial_properties = super(options)
    serial_properties["can_update"] = self.can_update
    serial_properties["shard_blur_version"] = self.shard_version
    serial_properties["shard_status"] = self.shard_status
    cluster_queried = false
    self.blur_tables.each do |table| 
      cluster_queried = true if table.as_json["queried_recently"] == true
    end
    serial_properties["cluster_queried"] = cluster_queried
    serial_properties
  end

  def shard_version
    versions = self.blur_shards.select(:blur_version).group(:blur_version)
    if versions.length < 1
      "No shards in this Cluster!"
    else
      versions.length == 1 ? versions.first.blur_version : "Inconsistent Blur Versions"
    end
  end

  def shard_status
    shard_total = self.blur_shards.count
    shards_online = 0
    self.blur_shards.each do |s|
      shards_online += 1 if s.status == 1
    end
    "#{shards_online} | #{shard_total}"
  end
end
