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
import com.smartrecruiters.api.job.model.JobAdLanguage;
import com.smartrecruiters.api.job.model.JobAdSections;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * JobAdContent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-01T16:01:57.232855+01:00[Europe/Rome]")
public class JobAdContent {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private JobAdLanguage language;

  public static final String SERIALIZED_NAME_JOB_AD = "jobAd";
  @SerializedName(SERIALIZED_NAME_JOB_AD)
  private JobAdSections jobAd;


  public JobAdContent title(String title) {
    
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


  public JobAdContent language(JobAdLanguage language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobAdLanguage getLanguage() {
    return language;
  }



  public void setLanguage(JobAdLanguage language) {
    this.language = language;
  }


  public JobAdContent jobAd(JobAdSections jobAd) {
    
    this.jobAd = jobAd;
    return this;
  }

   /**
   * Get jobAd
   * @return jobAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobAdSections getJobAd() {
    return jobAd;
  }



  public void setJobAd(JobAdSections jobAd) {
    this.jobAd = jobAd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobAdContent jobAdContent = (JobAdContent) o;
    return Objects.equals(this.title, jobAdContent.title) &&
        Objects.equals(this.language, jobAdContent.language) &&
        Objects.equals(this.jobAd, jobAdContent.jobAd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, language, jobAd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobAdContent {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    jobAd: ").append(toIndentedString(jobAd)).append("\n");
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

