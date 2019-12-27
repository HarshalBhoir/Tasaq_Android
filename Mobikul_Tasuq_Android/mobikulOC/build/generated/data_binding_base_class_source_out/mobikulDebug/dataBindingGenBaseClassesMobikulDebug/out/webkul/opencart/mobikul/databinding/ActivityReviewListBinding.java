package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ActivityReviewListBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final RecyclerView recyclerview;

  @NonNull
  public final View toolbar;

  protected ActivityReviewListBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, RecyclerView recyclerview, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.recyclerview = recyclerview;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityReviewListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityReviewListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityReviewListBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_review__list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityReviewListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityReviewListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityReviewListBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_review__list, null, false, component);
  }

  public static ActivityReviewListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityReviewListBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityReviewListBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_review__list);
  }
}
