package io.sentry;

import io.sentry.vendor.gson.stream.JsonReader;
import io.sentry.vendor.gson.stream.JsonToken;

import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class JsonObjectReader extends JsonReader {

  public JsonObjectReader(Reader in) {
    super(in);
  }

  public @Nullable Object nextObjectOrNull(@NotNull JsonObjectReader reader)
      throws IOException {
    return new JsonObjectDeserializer().deserialize(reader);
  }
}
