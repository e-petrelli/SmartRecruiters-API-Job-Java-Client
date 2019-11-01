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
import com.smartrecruiters.api.job.model.JobSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Jobs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-01T16:01:57.232855+01:00[Europe/Rome]")
public class Jobs {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_TOTAL_FOUND = "totalFound";
  @SerializedName(SERIALIZED_NAME_TOTAL_FOUND)
  private Integer totalFound;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<JobSummary> content = null;


  public Jobs limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLimit() {
    return limit;
  }



  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public Jobs offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOffset() {
    return offset;
  }



  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public Jobs totalFound(Integer totalFound) {
    
    this.totalFound = totalFound;
    return this;
  }

   /**
   * Get totalFound
   * @return totalFound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalFound() {
    return totalFound;
  }



  public void setTotalFound(Integer totalFound) {
    this.totalFound = totalFound;
  }


  public Jobs content(List<JobSummary> content) {
    
    this.content = content;
    return this;
  }

  public Jobs addContentItem(JobSummary contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<JobSummary>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<JobSummary> getContent() {
    return content;
  }



  public void setContent(List<JobSummary> content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Jobs jobs = (Jobs) o;
    return Objects.equals(this.limit, jobs.limit) &&
        Objects.equals(this.offset, jobs.offset) &&
        Objects.equals(this.totalFound, jobs.totalFound) &&
        Objects.equals(this.content, jobs.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, totalFound, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jobs {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    totalFound: ").append(toIndentedString(totalFound)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

