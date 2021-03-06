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
import com.smartrecruiters.api.job.model.Identifiable;
import com.smartrecruiters.api.job.model.JobAdItemActions;
import com.smartrecruiters.api.job.model.JobAdSections;
import com.smartrecruiters.api.job.model.Language;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * JobAdItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-01T16:01:57.232855+01:00[Europe/Rome]")
public class JobAdItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private Language language;

  public static final String SERIALIZED_NAME_JOB_AD = "jobAd";
  @SerializedName(SERIALIZED_NAME_JOB_AD)
  private JobAdSections jobAd;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_UPDATED_ON = "updatedOn";
  @SerializedName(SERIALIZED_NAME_UPDATED_ON)
  private OffsetDateTime updatedOn;

  public static final String SERIALIZED_NAME_APPLY_URL = "applyUrl";
  @SerializedName(SERIALIZED_NAME_APPLY_URL)
  private String applyUrl;

  /**
   * Gets or Sets postingStatus
   */
  @JsonAdapter(PostingStatusEnum.Adapter.class)
  public enum PostingStatusEnum {
    PUBLISHED("PUBLISHED"),
    
    NOT_PUBLISHED("NOT_PUBLISHED");

    private String value;

    PostingStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PostingStatusEnum fromValue(String value) {
      for (PostingStatusEnum b : PostingStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PostingStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PostingStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PostingStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PostingStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_POSTING_STATUS = "postingStatus";
  @SerializedName(SERIALIZED_NAME_POSTING_STATUS)
  private PostingStatusEnum postingStatus;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private JobAdItemActions actions;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private Identifiable creator;


  public JobAdItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }



  public void setId(String id) {
    this.id = id;
  }


  public JobAdItem title(String title) {
    
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


  public JobAdItem language(Language language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(required = true, value = "")

  public Language getLanguage() {
    return language;
  }



  public void setLanguage(Language language) {
    this.language = language;
  }


  public JobAdItem jobAd(JobAdSections jobAd) {
    
    this.jobAd = jobAd;
    return this;
  }

   /**
   * Get jobAd
   * @return jobAd
  **/
  @ApiModelProperty(required = true, value = "")

  public JobAdSections getJobAd() {
    return jobAd;
  }



  public void setJobAd(JobAdSections jobAd) {
    this.jobAd = jobAd;
  }


  public JobAdItem createdOn(OffsetDateTime createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  public JobAdItem updatedOn(OffsetDateTime updatedOn) {
    
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Get updatedOn
   * @return updatedOn
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }



  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }


  public JobAdItem applyUrl(String applyUrl) {
    
    this.applyUrl = applyUrl;
    return this;
  }

   /**
   * Get applyUrl
   * @return applyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApplyUrl() {
    return applyUrl;
  }



  public void setApplyUrl(String applyUrl) {
    this.applyUrl = applyUrl;
  }


  public JobAdItem postingStatus(PostingStatusEnum postingStatus) {
    
    this.postingStatus = postingStatus;
    return this;
  }

   /**
   * Get postingStatus
   * @return postingStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public PostingStatusEnum getPostingStatus() {
    return postingStatus;
  }



  public void setPostingStatus(PostingStatusEnum postingStatus) {
    this.postingStatus = postingStatus;
  }


  public JobAdItem _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getDefault() {
    return _default;
  }



  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public JobAdItem actions(JobAdItemActions actions) {
    
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "")

  public JobAdItemActions getActions() {
    return actions;
  }



  public void setActions(JobAdItemActions actions) {
    this.actions = actions;
  }


  public JobAdItem creator(Identifiable creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @ApiModelProperty(required = true, value = "")

  public Identifiable getCreator() {
    return creator;
  }



  public void setCreator(Identifiable creator) {
    this.creator = creator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobAdItem jobAdItem = (JobAdItem) o;
    return Objects.equals(this.id, jobAdItem.id) &&
        Objects.equals(this.title, jobAdItem.title) &&
        Objects.equals(this.language, jobAdItem.language) &&
        Objects.equals(this.jobAd, jobAdItem.jobAd) &&
        Objects.equals(this.createdOn, jobAdItem.createdOn) &&
        Objects.equals(this.updatedOn, jobAdItem.updatedOn) &&
        Objects.equals(this.applyUrl, jobAdItem.applyUrl) &&
        Objects.equals(this.postingStatus, jobAdItem.postingStatus) &&
        Objects.equals(this._default, jobAdItem._default) &&
        Objects.equals(this.actions, jobAdItem.actions) &&
        Objects.equals(this.creator, jobAdItem.creator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, language, jobAd, createdOn, updatedOn, applyUrl, postingStatus, _default, actions, creator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobAdItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    jobAd: ").append(toIndentedString(jobAd)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    applyUrl: ").append(toIndentedString(applyUrl)).append("\n");
    sb.append("    postingStatus: ").append(toIndentedString(postingStatus)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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

