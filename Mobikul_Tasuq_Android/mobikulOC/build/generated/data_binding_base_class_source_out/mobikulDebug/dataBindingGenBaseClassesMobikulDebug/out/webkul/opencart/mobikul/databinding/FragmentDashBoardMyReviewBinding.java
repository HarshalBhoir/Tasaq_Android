package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class FragmentDashBoardMyReviewBinding extends ViewDataBinding {
  protected FragmentDashBoardMyReviewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  @NonNull
  public static FragmentDashBoardMyReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDashBoardMyReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDashBoardMyReviewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_dash_board_my_review, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDashBoardMyReviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDashBoardMyReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDashBoardMyReviewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_dash_board_my_review, null, false, component);
  }

  public static FragmentDashBoardMyReviewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDashBoardMyReviewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDashBoardMyReviewBinding)bind(component, view, webkul.opencart.mobikul.R.layout.fragment_dash_board_my_review);
  }
}
