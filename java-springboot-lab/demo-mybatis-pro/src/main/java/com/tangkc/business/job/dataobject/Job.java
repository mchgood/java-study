package com.tangkc.business.job.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tangkc.common.entity.BaseEntity;

import java.time.LocalDateTime;

@TableName(value = "t_job")
public class Job extends BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * ID
     */
    @TableField(value = "jobid")
    private String jobid;

    /**
     * 公司ID
     */
    @TableField(value = "coid")
    private String coid;

    /**
     * 公司名称
     */
    @TableField(value = "company_name")
    private String companyName;

    /**
     * 公司链接
     */
    @TableField(value = "company_href")
    private String companyHref;

    /**
     * 岗位名称
     */
    @TableField(value = "job_name")
    private String jobName;

    /**
     * 岗位titile
     */
    @TableField(value = "job_title")
    private String jobTitle;

    /**
     * 岗位链接
     */
    @TableField(value = "job_href")
    private String jobHref;

    /**
     * 工资描述
     */
    @TableField(value = "provide_salary")
    private String provideSalary;

    /**
     * 公司类型
     */
    @TableField(value = "company_type")
    private String companyType;

    /**
     * 公司规模
     */
    @TableField(value = "company_size")
    private String companySize;

    /**
     * 公司福利
     */
    @TableField(value = "job_welf")
    private String jobWelf;

    /**
     * 招聘属性
     */
    @TableField(value = "job_attribute")
    private String jobAttribute;

    /**
     * 公司具体区域(按区)
     */
    @TableField(value = "work_area")
    private String workArea;

    /**
     * 公司具体区域编码(按区)
     */
    @TableField(value = "work_area_id")
    private String workAreaId;

    /**
     * 地区名称(按城市)
     */
    @TableField(value = "work_area_name")
    private String workAreaName;

    /**
     * 更新时间
     */
    @TableField(value = "update_date")
    private String updateDate;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime createTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取ID
     *
     * @return jobid - ID
     */
    public String getJobid() {
        return jobid;
    }

    /**
     * 设置ID
     *
     * @param jobid ID
     */
    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    /**
     * 获取公司ID
     *
     * @return coid - 公司ID
     */
    public String getCoid() {
        return coid;
    }

    /**
     * 设置公司ID
     *
     * @param coid 公司ID
     */
    public void setCoid(String coid) {
        this.coid = coid;
    }

    /**
     * 获取公司名称
     *
     * @return company_name - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取公司链接
     *
     * @return company_href - 公司链接
     */
    public String getCompanyHref() {
        return companyHref;
    }

    /**
     * 设置公司链接
     *
     * @param companyHref 公司链接
     */
    public void setCompanyHref(String companyHref) {
        this.companyHref = companyHref;
    }

    /**
     * 获取岗位名称
     *
     * @return job_name - 岗位名称
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 设置岗位名称
     *
     * @param jobName 岗位名称
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * 获取岗位titile
     *
     * @return job_title - 岗位titile
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * 设置岗位titile
     *
     * @param jobTitle 岗位titile
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * 获取岗位链接
     *
     * @return job_href - 岗位链接
     */
    public String getJobHref() {
        return jobHref;
    }

    /**
     * 设置岗位链接
     *
     * @param jobHref 岗位链接
     */
    public void setJobHref(String jobHref) {
        this.jobHref = jobHref;
    }

    /**
     * 获取工资描述
     *
     * @return provide_salary - 工资描述
     */
    public String getProvideSalary() {
        return provideSalary;
    }

    /**
     * 设置工资描述
     *
     * @param provideSalary 工资描述
     */
    public void setProvideSalary(String provideSalary) {
        this.provideSalary = provideSalary;
    }

    /**
     * 获取公司类型
     *
     * @return company_type - 公司类型
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * 设置公司类型
     *
     * @param companyType 公司类型
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    /**
     * 获取公司规模
     *
     * @return company_size - 公司规模
     */
    public String getCompanySize() {
        return companySize;
    }

    /**
     * 设置公司规模
     *
     * @param companySize 公司规模
     */
    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    /**
     * 获取公司福利
     *
     * @return job_welf - 公司福利
     */
    public String getJobWelf() {
        return jobWelf;
    }

    /**
     * 设置公司福利
     *
     * @param jobWelf 公司福利
     */
    public void setJobWelf(String jobWelf) {
        this.jobWelf = jobWelf;
    }

    /**
     * 获取招聘属性
     *
     * @return job_attribute - 招聘属性
     */
    public String getJobAttribute() {
        return jobAttribute;
    }

    /**
     * 设置招聘属性
     *
     * @param jobAttribute 招聘属性
     */
    public void setJobAttribute(String jobAttribute) {
        this.jobAttribute = jobAttribute;
    }

    /**
     * 获取公司具体区域(按区)
     *
     * @return work_area - 公司具体区域(按区)
     */
    public String getWorkArea() {
        return workArea;
    }

    /**
     * 设置公司具体区域(按区)
     *
     * @param workArea 公司具体区域(按区)
     */
    public void setWorkArea(String workArea) {
        this.workArea = workArea;
    }

    /**
     * 获取公司具体区域编码(按区)
     *
     * @return work_area_id - 公司具体区域编码(按区)
     */
    public String getWorkAreaId() {
        return workAreaId;
    }

    /**
     * 设置公司具体区域编码(按区)
     *
     * @param workAreaId 公司具体区域编码(按区)
     */
    public void setWorkAreaId(String workAreaId) {
        this.workAreaId = workAreaId;
    }

    /**
     * 获取地区名称(按城市)
     *
     * @return work_area_name - 地区名称(按城市)
     */
    public String getWorkAreaName() {
        return workAreaName;
    }

    /**
     * 设置地区名称(按城市)
     *
     * @param workAreaName 地区名称(按城市)
     */
    public void setWorkAreaName(String workAreaName) {
        this.workAreaName = workAreaName;
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}