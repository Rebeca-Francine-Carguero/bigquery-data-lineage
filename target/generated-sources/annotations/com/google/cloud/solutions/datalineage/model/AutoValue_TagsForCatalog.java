package com.google.cloud.solutions.datalineage.model;

import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TagsForCatalog extends TagsForCatalog {

  private final String entryId;

  private final ImmutableList<String> tagsJson;

  private AutoValue_TagsForCatalog(
      String entryId,
      ImmutableList<String> tagsJson) {
    this.entryId = entryId;
    this.tagsJson = tagsJson;
  }

  @Override
  public String getEntryId() {
    return entryId;
  }

  @Override
  public ImmutableList<String> getTagsJson() {
    return tagsJson;
  }

  @Override
  public String toString() {
    return "TagsForCatalog{"
         + "entryId=" + entryId + ", "
         + "tagsJson=" + tagsJson
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TagsForCatalog) {
      TagsForCatalog that = (TagsForCatalog) o;
      return this.entryId.equals(that.getEntryId())
          && this.tagsJson.equals(that.getTagsJson());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= entryId.hashCode();
    h$ *= 1000003;
    h$ ^= tagsJson.hashCode();
    return h$;
  }

  static final class Builder extends TagsForCatalog.Builder {
    private String entryId;
    private ImmutableList<String> tagsJson;
    Builder() {
    }
    @Override
    public TagsForCatalog.Builder setEntryId(String entryId) {
      if (entryId == null) {
        throw new NullPointerException("Null entryId");
      }
      this.entryId = entryId;
      return this;
    }
    @Override
    public TagsForCatalog.Builder setTagsJson(ImmutableList<String> tagsJson) {
      if (tagsJson == null) {
        throw new NullPointerException("Null tagsJson");
      }
      this.tagsJson = tagsJson;
      return this;
    }
    @Override
    public TagsForCatalog build() {
      String missing = "";
      if (this.entryId == null) {
        missing += " entryId";
      }
      if (this.tagsJson == null) {
        missing += " tagsJson";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_TagsForCatalog(
          this.entryId,
          this.tagsJson);
    }
  }

}
