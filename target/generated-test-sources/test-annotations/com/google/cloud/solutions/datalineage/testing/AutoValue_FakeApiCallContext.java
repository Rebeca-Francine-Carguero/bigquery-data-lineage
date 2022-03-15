package com.google.cloud.solutions.datalineage.testing;

import com.google.api.core.BetaApi;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.TransportChannel;
import com.google.api.gax.tracing.ApiTracer;
import com.google.auth.Credentials;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.threeten.bp.Duration;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FakeApiCallContext extends FakeApiCallContext {

  private final RetrySettings retrySettings;

  private final Set<StatusCode.Code> retryableCodes;

  private final Map<String, List<String>> extraHeaders;

  private final Duration streamIdleTimeout;

  private final Duration streamWaitTimeout;

  private final Duration timeout;

  private final ApiTracer tracer;

  private final Credentials credentials;

  private final TransportChannel transportChannel;

  private AutoValue_FakeApiCallContext(
      @Nullable RetrySettings retrySettings,
      @Nullable Set<StatusCode.Code> retryableCodes,
      Map<String, List<String>> extraHeaders,
      @Nullable Duration streamIdleTimeout,
      @Nullable Duration streamWaitTimeout,
      @Nullable Duration timeout,
      ApiTracer tracer,
      @Nullable Credentials credentials,
      @Nullable TransportChannel transportChannel) {
    this.retrySettings = retrySettings;
    this.retryableCodes = retryableCodes;
    this.extraHeaders = extraHeaders;
    this.streamIdleTimeout = streamIdleTimeout;
    this.streamWaitTimeout = streamWaitTimeout;
    this.timeout = timeout;
    this.tracer = tracer;
    this.credentials = credentials;
    this.transportChannel = transportChannel;
  }

  @Nullable
  @Override
  public RetrySettings getRetrySettings() {
    return retrySettings;
  }

  @Nullable
  @Override
  public Set<StatusCode.Code> getRetryableCodes() {
    return retryableCodes;
  }

  @BetaApi("The surface for extra headers is not stable yet and may change in the future.")
  @Override
  public Map<String, List<String>> getExtraHeaders() {
    return extraHeaders;
  }

  @BetaApi("The surface for streaming is not stable yet and may change in the future.")
  @Nullable
  @Override
  public Duration getStreamIdleTimeout() {
    return streamIdleTimeout;
  }

  @BetaApi("The surface for streaming is not stable yet and may change in the future.")
  @Nullable
  @Override
  public Duration getStreamWaitTimeout() {
    return streamWaitTimeout;
  }

  @Nullable
  @Override
  public Duration getTimeout() {
    return timeout;
  }

  @BetaApi("The surface for tracing is not stable yet and may change in the future")
  @Nonnull
  @Override
  public ApiTracer getTracer() {
    return tracer;
  }

  @Nullable
  @Override
  public Credentials getCredentials() {
    return credentials;
  }

  @Nullable
  @Override
  public TransportChannel getTransportChannel() {
    return transportChannel;
  }

  @Override
  public String toString() {
    return "FakeApiCallContext{"
         + "retrySettings=" + retrySettings + ", "
         + "retryableCodes=" + retryableCodes + ", "
         + "extraHeaders=" + extraHeaders + ", "
         + "streamIdleTimeout=" + streamIdleTimeout + ", "
         + "streamWaitTimeout=" + streamWaitTimeout + ", "
         + "timeout=" + timeout + ", "
         + "tracer=" + tracer + ", "
         + "credentials=" + credentials + ", "
         + "transportChannel=" + transportChannel
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FakeApiCallContext) {
      FakeApiCallContext that = (FakeApiCallContext) o;
      return (this.retrySettings == null ? that.getRetrySettings() == null : this.retrySettings.equals(that.getRetrySettings()))
          && (this.retryableCodes == null ? that.getRetryableCodes() == null : this.retryableCodes.equals(that.getRetryableCodes()))
          && this.extraHeaders.equals(that.getExtraHeaders())
          && (this.streamIdleTimeout == null ? that.getStreamIdleTimeout() == null : this.streamIdleTimeout.equals(that.getStreamIdleTimeout()))
          && (this.streamWaitTimeout == null ? that.getStreamWaitTimeout() == null : this.streamWaitTimeout.equals(that.getStreamWaitTimeout()))
          && (this.timeout == null ? that.getTimeout() == null : this.timeout.equals(that.getTimeout()))
          && this.tracer.equals(that.getTracer())
          && (this.credentials == null ? that.getCredentials() == null : this.credentials.equals(that.getCredentials()))
          && (this.transportChannel == null ? that.getTransportChannel() == null : this.transportChannel.equals(that.getTransportChannel()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (retrySettings == null) ? 0 : retrySettings.hashCode();
    h$ *= 1000003;
    h$ ^= (retryableCodes == null) ? 0 : retryableCodes.hashCode();
    h$ *= 1000003;
    h$ ^= extraHeaders.hashCode();
    h$ *= 1000003;
    h$ ^= (streamIdleTimeout == null) ? 0 : streamIdleTimeout.hashCode();
    h$ *= 1000003;
    h$ ^= (streamWaitTimeout == null) ? 0 : streamWaitTimeout.hashCode();
    h$ *= 1000003;
    h$ ^= (timeout == null) ? 0 : timeout.hashCode();
    h$ *= 1000003;
    h$ ^= tracer.hashCode();
    h$ *= 1000003;
    h$ ^= (credentials == null) ? 0 : credentials.hashCode();
    h$ *= 1000003;
    h$ ^= (transportChannel == null) ? 0 : transportChannel.hashCode();
    return h$;
  }

  @Override
  public FakeApiCallContext.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends FakeApiCallContext.Builder {
    private RetrySettings retrySettings;
    private Set<StatusCode.Code> retryableCodes;
    private Map<String, List<String>> extraHeaders;
    private Duration streamIdleTimeout;
    private Duration streamWaitTimeout;
    private Duration timeout;
    private ApiTracer tracer;
    private Credentials credentials;
    private TransportChannel transportChannel;
    Builder() {
    }
    private Builder(FakeApiCallContext source) {
      this.retrySettings = source.getRetrySettings();
      this.retryableCodes = source.getRetryableCodes();
      this.extraHeaders = source.getExtraHeaders();
      this.streamIdleTimeout = source.getStreamIdleTimeout();
      this.streamWaitTimeout = source.getStreamWaitTimeout();
      this.timeout = source.getTimeout();
      this.tracer = source.getTracer();
      this.credentials = source.getCredentials();
      this.transportChannel = source.getTransportChannel();
    }
    @Override
    public FakeApiCallContext.Builder setRetrySettings(RetrySettings retrySettings) {
      this.retrySettings = retrySettings;
      return this;
    }
    @Override
    public FakeApiCallContext.Builder setRetryableCodes(Set<StatusCode.Code> retryableCodes) {
      this.retryableCodes = retryableCodes;
      return this;
    }
    @Override
    public FakeApiCallContext.Builder setExtraHeaders(@Nullable Map<String, List<String>> extraHeaders) {
      if (extraHeaders == null) {
        throw new NullPointerException("Null extraHeaders");
      }
      this.extraHeaders = extraHeaders;
      return this;
    }
    @Override
    public FakeApiCallContext.Builder setStreamIdleTimeout(@Nullable Duration streamIdleTimeout) {
      this.streamIdleTimeout = streamIdleTimeout;
      return this;
    }
    @Override
    public FakeApiCallContext.Builder setStreamWaitTimeout(@Nullable Duration streamWaitTimeout) {
      this.streamWaitTimeout = streamWaitTimeout;
      return this;
    }
    @Override
    public FakeApiCallContext.Builder setTimeout(@Nullable Duration timeout) {
      this.timeout = timeout;
      return this;
    }
    @Override
    public FakeApiCallContext.Builder setTracer(ApiTracer tracer) {
      if (tracer == null) {
        throw new NullPointerException("Null tracer");
      }
      this.tracer = tracer;
      return this;
    }
    @Override
    public FakeApiCallContext.Builder setCredentials(@Nullable Credentials credentials) {
      this.credentials = credentials;
      return this;
    }
    @Override
    public FakeApiCallContext.Builder setTransportChannel(@Nullable TransportChannel transportChannel) {
      this.transportChannel = transportChannel;
      return this;
    }
    @Override
    public FakeApiCallContext build() {
      String missing = "";
      if (this.extraHeaders == null) {
        missing += " extraHeaders";
      }
      if (this.tracer == null) {
        missing += " tracer";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_FakeApiCallContext(
          this.retrySettings,
          this.retryableCodes,
          this.extraHeaders,
          this.streamIdleTimeout,
          this.streamWaitTimeout,
          this.timeout,
          this.tracer,
          this.credentials,
          this.transportChannel);
    }
  }

}
