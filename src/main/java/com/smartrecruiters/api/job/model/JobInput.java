/*
 * Jobs API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.smartrecruiters.api.job.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartrecruiters.api.job.model.Compensation;
import com.smartrecruiters.api.job.model.Identifiable;
import com.smartrecruiters.api.job.model.JobAd;
import com.smartrecruiters.api.job.model.JobLocationInput;
import com.smartrecruiters.api.job.model.JobPropertyInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * JobInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-01T16:01:57.232855+01:00[Europe/Rome]")
public class JobInput {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_REF_NUMBER = "refNumber";
  @SerializedName(SERIALIZED_NAME_REF_NUMBER)
  private String refNumber;

  public static final String SERIALIZED_NAME_TARGET_HIRING_DATE = "targetHiringDate";
  @SerializedName(SERIALIZED_NAME_TARGET_HIRING_DATE)
  private OffsetDateTime targetHiringDate;

  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private Identifiable department;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private JobLocationInput location;

  public static final String SERIALIZED_NAME_INDUSTRY = "industry";
  @SerializedName(SERIALIZED_NAME_INDUSTRY)
  private Identifiable industry;

  public static final String SERIALIZED_NAME_FUNCTION = "function";
  @SerializedName(SERIALIZED_NAME_FUNCTION)
  private Identifiable function;

  public static final String SERIALIZED_NAME_TYPE_OF_EMPLOYMENT = "typeOfEmployment";
  @SerializedName(SERIALIZED_NAME_TYPE_OF_EMPLOYMENT)
  private Identifiable typeOfEmployment;

  public static final String SERIALIZED_NAME_EXPERIENCE_LEVEL = "experienceLevel";
  @SerializedName(SERIALIZED_NAME_EXPERIENCE_LEVEL)
  private Identifiable experienceLevel;

  public static final String SERIALIZED_NAME_EEO_CATEGORY = "eeoCategory";
  @SerializedName(SERIALIZED_NAME_EEO_CATEGORY)
  private Identifiable eeoCategory;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Boolean template;

  public static final String SERIALIZED_NAME_COMPENSATION = "compensation";
  @SerializedName(SERIALIZED_NAME_COMPENSATION)
  private Compensation compensation;

  public static final String SERIALIZED_NAME_JOB_AD = "jobAd";
  @SerializedName(SERIALIZED_NAME_JOB_AD)
  private JobAd jobAd;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<JobPropertyInput> properties = null;


  public JobInput title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")

  public String getTitle() {
    return title;
  }



  public void setTitle(String title) {
    this.title = title;
  }


  public JobInput refNumber(String refNumber) {
    
    this.refNumber = refNumber;
    return this;
  }

   /**
   * Get refNumber
   * @return refNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefNumber() {
    return refNumber;
  }



  public void setRefNumber(String refNumber) {
    this.refNumber = refNumber;
  }


  public JobInput targetHiringDate(OffsetDateTime targetHiringDate) {
    
    this.targetHiringDate = targetHiringDate;
    return this;
  }

   /**
   * Get targetHiringDate
   * @return targetHiringDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getTargetHiringDate() {
    return targetHiringDate;
  }



  public void setTargetHiringDate(OffsetDateTime targetHiringDate) {
    this.targetHiringDate = targetHiringDate;
  }


  public JobInput department(Identifiable department) {
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Identifiable getDepartment() {
    return department;
  }



  public void setDepartment(Identifiable department) {
    this.department = department;
  }


  public JobInput location(JobLocationInput location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "")

  public JobLocationInput getLocation() {
    return location;
  }



  public void setLocation(JobLocationInput location) {
    this.location = location;
  }


  public JobInput industry(Identifiable industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/
  @ApiModelProperty(required = true, value = "")

  public Identifiable getIndustry() {
    return industry;
  }



  public void setIndustry(Identifiable industry) {
    this.industry = industry;
  }


  public JobInput function(Identifiable function) {
    
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @ApiModelProperty(required = true, value = "")

  public Identifiable getFunction() {
    return function;
  }



  public void setFunction(Identifiable function) {
    this.function = function;
  }


  public JobInput typeOfEmployment(Identifiable typeOfEmployment) {
    
    this.typeOfEmployment = typeOfEmployment;
    return this;
  }

   /**
   * Get typeOfEmployment
   * @return typeOfEmployment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Identifiable getTypeOfEmployment() {
    return typeOfEmployment;
  }



  public void setTypeOfEmployment(Identifiable typeOfEmployment) {
    this.typeOfEmployment = typeOfEmployment;
  }


  public JobInput experienceLevel(Identifiable experienceLevel) {
    
    this.experienceLevel = experienceLevel;
    return this;
  }

   /**
   * Get experienceLevel
   * @return experienceLevel
  **/
  @ApiModelProperty(required = true, value = "")

  public Identifiable getExperienceLevel() {
    return experienceLevel;
  }



  public void setExperienceLevel(Identifiable experienceLevel) {
    this.experienceLevel = experienceLevel;
  }


  public JobInput eeoCategory(Identifiable eeoCategory) {
    
    this.eeoCategory = eeoCategory;
    return this;
  }

   /**
   * Get eeoCategory
   * @return eeoCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Identifiable getEeoCategory() {
    return eeoCategory;
  }



  public void setEeoCategory(Identifiable eeoCategory) {
    this.eeoCategory = eeoCategory;
  }


  public JobInput template(Boolean template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTemplate() {
    return template;
  }



  public void setTemplate(Boolean template) {
    this.template = template;
  }


  public JobInput compensation(Compensation compensation) {
    
    this.compensation = compensation;
    return this;
  }

   /**
   * Get compensation
   * @return compensation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Compensation getCompensation() {
    return compensation;
  }



  public void setCompensation(Compensation compensation) {
    this.compensation = compensation;
  }


  public JobInput jobAd(JobAd jobAd) {
    
    this.jobAd = jobAd;
    return this;
  }

   /**
   * Get jobAd
   * @return jobAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobAd getJobAd() {
    return jobAd;
  }



  public void setJobAd(JobAd jobAd) {
    this.jobAd = jobAd;
  }


  public JobInput properties(List<JobPropertyInput> properties) {
    
    this.properties = properties;
    return this;
  }

  public JobInput addPropertiesItem(JobPropertyInput propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<JobPropertyInput>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<JobPropertyInput> getProperties() {
    return properties;
  }



  public void setProperties(List<JobPropertyInput> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobInput jobInput = (JobInput) o;
    return Objects.equals(this.title, jobInput.title) &&
        Objects.equals(this.refNumber, jobInput.refNumber) &&
        Objects.equals(this.targetHiringDate, jobInput.targetHiringDate) &&
        Objects.equals(this.department, jobInput.department) &&
        Objects.equals(this.location, jobInput.location) &&
        Objects.equals(this.industry, jobInput.industry) &&
        Objects.equals(this.function, jobInput.function) &&
        Objects.equals(this.typeOfEmployment, jobInput.typeOfEmployment) &&
        Objects.equals(this.experienceLevel, jobInput.experienceLevel) &&
        Objects.equals(this.eeoCategory, jobInput.eeoCategory) &&
        Objects.equals(this.template, jobInput.template) &&
        Objects.equals(this.compensation, jobInput.compensation) &&
        Objects.equals(this.jobAd, jobInput.jobAd) &&
        Objects.equals(this.properties, jobInput.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, refNumber, targetHiringDate, department, location, industry, function, typeOfEmployment, experienceLevel, eeoCategory, template, compensation, jobAd, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobInput {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    refNumber: ").append(toIndentedString(refNumber)).append("\n");
    sb.append("    targetHiringDate: ").append(toIndentedString(targetHiringDate)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    typeOfEmployment: ").append(toIndentedString(typeOfEmployment)).append("\n");
    sb.append("    experienceLevel: ").append(toIndentedString(experienceLevel)).append("\n");
    sb.append("    eeoCategory: ").append(toIndentedString(eeoCategory)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    compensation: ").append(toIndentedString(compensation)).append("\n");
    sb.append("    jobAd: ").append(toIndentedString(jobAd)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

