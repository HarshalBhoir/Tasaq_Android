// Generated by Dagger (https://google.github.io/dagger).
package webkul.opencart.mobikul.dagger;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ContextModule_GetContextFactory implements Factory<Context> {
  private final ContextModule module;

  public ContextModule_GetContextFactory(ContextModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideInstance(module);
  }

  public static Context provideInstance(ContextModule module) {
    return proxyGetContext(module);
  }

  public static ContextModule_GetContextFactory create(ContextModule module) {
    return new ContextModule_GetContextFactory(module);
  }

  public static Context proxyGetContext(ContextModule instance) {
    return Preconditions.checkNotNull(
        instance.getContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
