package com.shifen.cloud.name.common.entity;

/**
 * @author guofengzhao
 *
 */
public class CloudHost {
  private long id; // required
  private String hostname; // required
  private String ip; // required
  private String wanIp; // required
  private int cpuQuota; // required
  private int memQuota; // required
  private int systemDiskQuota; // required
  private int homeDiskQuota; // required
  private String idc; // required
  
  public CloudHost() {}
  
  public CloudHost(long id, String hostname, String ip, String wanIp, 
      int cpuQuota, int memQuota, int systemDiskQuota, int homeDiskQuota, String idc) {
    this.id = id;
    this.hostname = hostname;
    this.ip = ip;
    this.wanIp = wanIp;
    this.cpuQuota = cpuQuota;
    this.memQuota = memQuota;
    this.systemDiskQuota = systemDiskQuota;
    this.homeDiskQuota = homeDiskQuota;
    this.idc = idc;
  }
  
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }
  public int getCpuQuota() {
    return cpuQuota;
  }
  public void setCpuQuota(int cpuQuota) {
    this.cpuQuota = cpuQuota;
  }
  public int getMemQuota() {
    return memQuota;
  }
  public void setMemQuota(int memQuota) {
    this.memQuota = memQuota;
  }
  public int getSystemDiskQuota() {
    return systemDiskQuota;
  }
  public void setSystemDiskQuota(int systemDiskQuota) {
    this.systemDiskQuota = systemDiskQuota;
  }
  public int getHomeDiskQuota() {
    return homeDiskQuota;
  }
  public void setHomeDiskQuota(int homeDiskQuota) {
    this.homeDiskQuota = homeDiskQuota;
  }
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }
  public String getWanIp() {
    return wanIp;
  }
  public void setWanIp(String wanIp) {
    this.wanIp = wanIp;
  }
  public String getIdc() {
    return idc;
  }
  public void setIdc(String idc) {
    this.idc = idc;
  }
  
  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    
    stringBuilder.append(id + "," + hostname + ",");
    stringBuilder.append(cpuQuota + "," + memQuota + ",");
    stringBuilder.append(ip + "," + idc);

    return stringBuilder.toString();
  }
}
