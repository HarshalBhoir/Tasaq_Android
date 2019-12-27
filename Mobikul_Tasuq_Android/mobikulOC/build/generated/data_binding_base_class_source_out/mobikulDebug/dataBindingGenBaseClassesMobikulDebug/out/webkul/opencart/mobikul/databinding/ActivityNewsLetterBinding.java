package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.card.MaterialCardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public abstract class ActivityNewsLetterBinding extends ViewDataBinding {
  @NonNull
  public final RadioGroup isSubscribed;

  @NonNull
  public final RadioButton no;

  @NonNull
  public final Button saveSubscription;

  @NonNull
  public final View toolbar;

  @NonNull
  public final MaterialCardView viewgap;

  @NonNull
  public final RadioButton yes;

  protected ActivityNewsLetterBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RadioGroup isSubscribed, RadioButton no, Button saveSubscription,
      View toolbar, MaterialCardView viewgap, RadioButton yes) {
    super(_bindingComponent, _root, _localFieldCount);
    this.isSubscribed = isSubscribed;
    this.no = no;
    this.saveSubscription = saveSubscription;
    this.toolbar = toolbar;
    this.viewgap = viewgap;
    this.yes = yes;
  }

  @NonNull
  public static ActivityNewsLetterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityNewsLetterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityNewsLetterBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_news_letter, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityNewsLetterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityNewsLetterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityNewsLetterBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_news_letter, null, false, component);
  }

  public static ActivityNewsLetterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityNewsLetterBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityNewsLetterBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_news_letter);
  }
}
