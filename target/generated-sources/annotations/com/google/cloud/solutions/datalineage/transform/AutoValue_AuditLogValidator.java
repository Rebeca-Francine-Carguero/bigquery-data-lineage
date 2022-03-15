package com.google.cloud.solutions.datalineage.transform;

import com.google.cloud.solutions.datalineage.model.BigQueryTableEntity;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AuditLogValidator extends AuditLogValidator {

  private final BigQueryTableEntity outputLineageTable;

  private AutoValue_AuditLogValidator(
      BigQueryTableEntity outputLineageTable) {
    this.outputLineageTable = outputLineageTable;
  }

  @Override
  public BigQueryTableEntity getOutputLineageTable() {
    return outputLineageTable;
  }

  @Override
  public String toString() {
    return "AuditLogValidator{"
         + "outputLineageTable=" + outputLineageTable
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AuditLogValidator) {
      AuditLogValidator that = (AuditLogValidator) o;
      return this.outputLineageTable.equals(that.getOutputLineageTable());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= outputLineageTable.hashCode();
    return h$;
  }

  static final class Builder extends AuditLogValidator.Builder {
    private BigQueryTableEntity outputLineageTable;
    Builder() {
    }
    @Override
    public AuditLogValidator.Builder setOutputLineageTable(BigQueryTableEntity outputLineageTable) {
      if (outputLineageTable == null) {
        throw new NullPointerException("Null outputLineageTable");
      }
      this.outputLineageTable = outputLineageTable;
      return this;
    }
    @Override
    public AuditLogValidator build() {
      String missing = "";
      if (this.outputLineageTable == null) {
        missing += " outputLineageTable";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_AuditLogValidator(
          this.outputLineageTable);
    }
  }

}
