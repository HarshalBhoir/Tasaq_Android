package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public abstract class CustomOptionDateViewBinding extends ViewDataBinding {
  @NonNull
  public final ImageView addDateImg;

  @NonNull
  public final EditText dateET;

  @NonNull
  public final Button resetBtn;

  protected CustomOptionDateViewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView addDateImg, EditText dateET, Button resetBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addDateImg = addDateImg;
    this.dateET = dateET;
    this.resetBtn = resetBtn;
  }

  @NonNull
  public static CustomOptionDateViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomOptionDateViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomOptionDateViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_option_date_view, root, attachToRoot, component);
  }

  @NonNull
  public static CustomOptionDateViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomOptionDateViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomOptionDateViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_option_date_view, null, false, component);
  }

  public static CustomOptionDateViewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CustomOptionDateViewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CustomOptionDateViewBinding)bind(component, view, webkul.opencart.mobikul.R.layout.custom_option_date_view);
  }
}
