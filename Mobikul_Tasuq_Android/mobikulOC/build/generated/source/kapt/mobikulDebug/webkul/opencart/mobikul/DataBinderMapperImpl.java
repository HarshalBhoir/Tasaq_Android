package webkul.opencart.mobikul;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import webkul.opencart.mobikul.databinding.ActivityAccountinfoBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityAddrBookBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityArBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityBaseNavigationDrawerBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityBrowerByBrandsBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityCameraWithImageBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityCartBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityCategoryBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityCheckout2BindingImpl;
import webkul.opencart.mobikul.databinding.ActivityCmspageBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityCreateAccountBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityDashBoardNewBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityDashboardBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityEbsPaymentSuccessBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityFileExplorerBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityItemTwopaneBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityLoginBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityMainBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityMyDownloadsBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityMyOrdersBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityMyWishlistBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityMyorderBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityNewAddressBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityNewsLetterBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityNotificationBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityOrderDetailsBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityOrderPlacedBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityOtherBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityProductDetails2BindingImpl;
import webkul.opencart.mobikul.databinding.ActivityQrCategoryBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityReturnDataBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityReturnOrderRequestBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityReviewDetailsBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityReviewListBindingImpl;
import webkul.opencart.mobikul.databinding.ActivitySplashscreenBindingImpl;
import webkul.opencart.mobikul.databinding.ActivitySubCategoryV3ThemeBindingImpl;
import webkul.opencart.mobikul.databinding.ActivitySubCategoryV4ThemeBindingImpl;
import webkul.opencart.mobikul.databinding.ActivitySubcategoryBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityViewDownloadableProductBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityViewMyOrderBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityViewMyReturnBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityViewPagerExampleBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityViewSimpleProductBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityViewmoreBindingImpl;
import webkul.opencart.mobikul.databinding.ActivityWalletBindingImpl;
import webkul.opencart.mobikul.databinding.AddressDashboardBindingImpl;
import webkul.opencart.mobikul.databinding.AddressItemsBindingImpl;
import webkul.opencart.mobikul.databinding.BecomeASellerBindingImpl;
import webkul.opencart.mobikul.databinding.BottomNavigationBindingImpl;
import webkul.opencart.mobikul.databinding.CarousalLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.CartOptionLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.CategoryFilterBindingImpl;
import webkul.opencart.mobikul.databinding.CheckoutBottomSheetAddressLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.CheckoutBottomSheetBindingImpl;
import webkul.opencart.mobikul.databinding.ChooseCategoryBindingImpl;
import webkul.opencart.mobikul.databinding.ClickableToastBindingImpl;
import webkul.opencart.mobikul.databinding.CommentToOrdersBindingImpl;
import webkul.opencart.mobikul.databinding.ConfirmorderProductLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.CurrencyLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.CustomOptionDateViewBindingImpl;
import webkul.opencart.mobikul.databinding.CustomOptionFileViewBindingImpl;
import webkul.opencart.mobikul.databinding.CustomOptionTimeViewBindingImpl;
import webkul.opencart.mobikul.databinding.CustomOrderViewPageBindingImpl;
import webkul.opencart.mobikul.databinding.CustomSpinnerBindingImpl;
import webkul.opencart.mobikul.databinding.CustomTextBindingImpl;
import webkul.opencart.mobikul.databinding.CustomToastBindingImpl;
import webkul.opencart.mobikul.databinding.DeliveryBoyLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.DeliveryboyTrackBindingImpl;
import webkul.opencart.mobikul.databinding.EditChangeAddressBindingImpl;
import webkul.opencart.mobikul.databinding.FeatureLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.FilterDialogBindingImpl;
import webkul.opencart.mobikul.databinding.FooterMenuLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentBillingAddressBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentBottomSheetBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentConfirmOrderBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentDashBoardMyOrdersBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentDashBoardMyReviewBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentDashboardMyAddressBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentDetailFeatureBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentFeatureProductBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentGuestBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentGuestShippingAddressBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentLatestProductBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentPaymentMethodBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentProfileBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentShippingAddressBindingImpl;
import webkul.opencart.mobikul.databinding.FragmentShippingMethodBindingImpl;
import webkul.opencart.mobikul.databinding.GdprNotificationInfoLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.GridhomeBindingImpl;
import webkul.opencart.mobikul.databinding.HomeLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.HomeProductCarousalBindingImpl;
import webkul.opencart.mobikul.databinding.ItemCartBindingImpl;
import webkul.opencart.mobikul.databinding.ItemCartTotalBindingImpl;
import webkul.opencart.mobikul.databinding.ItemLinksDownloadableProductBindingImpl;
import webkul.opencart.mobikul.databinding.ItemMyDownloadableProductBindingImpl;
import webkul.opencart.mobikul.databinding.ItemMyOrderBindingImpl;
import webkul.opencart.mobikul.databinding.ItemMyWishlistBindingImpl;
import webkul.opencart.mobikul.databinding.ItemNotificationBindingImpl;
import webkul.opencart.mobikul.databinding.ItemProductGridViewBindingImpl;
import webkul.opencart.mobikul.databinding.ItemProductListViewBindingImpl;
import webkul.opencart.mobikul.databinding.ItemViewPagerBannerBindingImpl;
import webkul.opencart.mobikul.databinding.LanguageLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.LayoutProductDescElvBindingImpl;
import webkul.opencart.mobikul.databinding.LayoutViewProductSmallImageViewBindingImpl;
import webkul.opencart.mobikul.databinding.LeftNavLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.MainProductSingleViewBindingImpl;
import webkul.opencart.mobikul.databinding.MobikulDialogBindingImpl;
import webkul.opencart.mobikul.databinding.MyReturnItemsBindingImpl;
import webkul.opencart.mobikul.databinding.NewAddressLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.NoInternetBindingImpl;
import webkul.opencart.mobikul.databinding.OrderedProductsInfBindingImpl;
import webkul.opencart.mobikul.databinding.PointAndTransactionDetailsBindingImpl;
import webkul.opencart.mobikul.databinding.ProceedToCheckoutDialogBindingImpl;
import webkul.opencart.mobikul.databinding.RecentSearchItemLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.RecentSearchLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.RecentViewProductLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.ReviewLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.ReviewOrderBindingImpl;
import webkul.opencart.mobikul.databinding.ReviewSingleLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.SearchCategoryItemBindingImpl;
import webkul.opencart.mobikul.databinding.SearchChildItemBindingImpl;
import webkul.opencart.mobikul.databinding.SearchDialogActivityBindingImpl;
import webkul.opencart.mobikul.databinding.SearchLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.SearchProductBindingImpl;
import webkul.opencart.mobikul.databinding.SearchProductItemLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.ShowMlDialogBindingImpl;
import webkul.opencart.mobikul.databinding.SimilarProductsBindingImpl;
import webkul.opencart.mobikul.databinding.SingleDashboardMyordersLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.SingleFeatureBindingImpl;
import webkul.opencart.mobikul.databinding.SingleFilterParentBindingImpl;
import webkul.opencart.mobikul.databinding.SingleLayoutBrandsBindingImpl;
import webkul.opencart.mobikul.databinding.SortItemLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.SortItemLayoutForManufactureBindingImpl;
import webkul.opencart.mobikul.databinding.SortItemLayoutForSearchBindingImpl;
import webkul.opencart.mobikul.databinding.SorterBotttomSheetBindingImpl;
import webkul.opencart.mobikul.databinding.SubCategoryGridBindingImpl;
import webkul.opencart.mobikul.databinding.SubcategoryFragmentListBindingImpl;
import webkul.opencart.mobikul.databinding.SubcategorySingleLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.SubcategoryV3themeLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.TableRowBindingImpl;
import webkul.opencart.mobikul.databinding.TableRowLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.ViewMoreItemLayoutBindingImpl;
import webkul.opencart.mobikul.databinding.ViewProductSimpleBannerBindingImpl;
import webkul.opencart.mobikul.databinding.ViewProductSimpleOptionLayoutBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYACCOUNTINFO = 1;

  private static final int LAYOUT_ACTIVITYADDRBOOK = 2;

  private static final int LAYOUT_ACTIVITYAR = 3;

  private static final int LAYOUT_ACTIVITYBASENAVIGATIONDRAWER = 4;

  private static final int LAYOUT_ACTIVITYBROWERBYBRANDS = 5;

  private static final int LAYOUT_ACTIVITYCAMERAWITHIMAGE = 6;

  private static final int LAYOUT_ACTIVITYCART = 7;

  private static final int LAYOUT_ACTIVITYCATEGORY = 8;

  private static final int LAYOUT_ACTIVITYCHECKOUT2 = 9;

  private static final int LAYOUT_ACTIVITYCMSPAGE = 10;

  private static final int LAYOUT_ACTIVITYCREATEACCOUNT = 11;

  private static final int LAYOUT_ACTIVITYDASHBOARDNEW = 12;

  private static final int LAYOUT_ACTIVITYDASHBOARD = 13;

  private static final int LAYOUT_ACTIVITYEBSPAYMENTSUCCESS = 14;

  private static final int LAYOUT_ACTIVITYFILEEXPLORER = 15;

  private static final int LAYOUT_ACTIVITYITEMTWOPANE = 16;

  private static final int LAYOUT_ACTIVITYLOGIN = 17;

  private static final int LAYOUT_ACTIVITYMAIN = 18;

  private static final int LAYOUT_ACTIVITYMYDOWNLOADS = 19;

  private static final int LAYOUT_ACTIVITYMYORDERS = 20;

  private static final int LAYOUT_ACTIVITYMYWISHLIST = 21;

  private static final int LAYOUT_ACTIVITYMYORDER = 22;

  private static final int LAYOUT_ACTIVITYNEWADDRESS = 23;

  private static final int LAYOUT_ACTIVITYNEWSLETTER = 24;

  private static final int LAYOUT_ACTIVITYNOTIFICATION = 25;

  private static final int LAYOUT_ACTIVITYORDERDETAILS = 26;

  private static final int LAYOUT_ACTIVITYORDERPLACED = 27;

  private static final int LAYOUT_ACTIVITYOTHER = 28;

  private static final int LAYOUT_ACTIVITYPRODUCTDETAILS2 = 29;

  private static final int LAYOUT_ACTIVITYQRCATEGORY = 30;

  private static final int LAYOUT_ACTIVITYRETURNDATA = 31;

  private static final int LAYOUT_ACTIVITYRETURNORDERREQUEST = 32;

  private static final int LAYOUT_ACTIVITYREVIEWLIST = 33;

  private static final int LAYOUT_ACTIVITYREVIEWDETAILS = 34;

  private static final int LAYOUT_ACTIVITYSPLASHSCREEN = 35;

  private static final int LAYOUT_ACTIVITYSUBCATEGORYV3THEME = 36;

  private static final int LAYOUT_ACTIVITYSUBCATEGORYV4THEME = 37;

  private static final int LAYOUT_ACTIVITYSUBCATEGORY = 38;

  private static final int LAYOUT_ACTIVITYVIEWDOWNLOADABLEPRODUCT = 39;

  private static final int LAYOUT_ACTIVITYVIEWMYORDER = 40;

  private static final int LAYOUT_ACTIVITYVIEWMYRETURN = 41;

  private static final int LAYOUT_ACTIVITYVIEWPAGEREXAMPLE = 42;

  private static final int LAYOUT_ACTIVITYVIEWSIMPLEPRODUCT = 43;

  private static final int LAYOUT_ACTIVITYVIEWMORE = 44;

  private static final int LAYOUT_ACTIVITYWALLET = 45;

  private static final int LAYOUT_ADDRESSDASHBOARD = 46;

  private static final int LAYOUT_ADDRESSITEMS = 47;

  private static final int LAYOUT_BECOMEASELLER = 48;

  private static final int LAYOUT_BOTTOMNAVIGATION = 49;

  private static final int LAYOUT_CAROUSALLAYOUT = 50;

  private static final int LAYOUT_CARTOPTIONLAYOUT = 51;

  private static final int LAYOUT_CATEGORYFILTER = 52;

  private static final int LAYOUT_CHECKOUTBOTTOMSHEET = 53;

  private static final int LAYOUT_CHECKOUTBOTTOMSHEETADDRESSLAYOUT = 54;

  private static final int LAYOUT_CHOOSECATEGORY = 55;

  private static final int LAYOUT_CLICKABLETOAST = 56;

  private static final int LAYOUT_COMMENTTOORDERS = 57;

  private static final int LAYOUT_CONFIRMORDERPRODUCTLAYOUT = 58;

  private static final int LAYOUT_CURRENCYLAYOUT = 59;

  private static final int LAYOUT_CUSTOMOPTIONDATEVIEW = 60;

  private static final int LAYOUT_CUSTOMOPTIONFILEVIEW = 61;

  private static final int LAYOUT_CUSTOMOPTIONTIMEVIEW = 62;

  private static final int LAYOUT_CUSTOMORDERVIEWPAGE = 63;

  private static final int LAYOUT_CUSTOMSPINNER = 64;

  private static final int LAYOUT_CUSTOMTEXT = 65;

  private static final int LAYOUT_CUSTOMTOAST = 66;

  private static final int LAYOUT_DELIVERYBOYLAYOUT = 67;

  private static final int LAYOUT_DELIVERYBOYTRACK = 68;

  private static final int LAYOUT_EDITCHANGEADDRESS = 69;

  private static final int LAYOUT_FEATURELAYOUT = 70;

  private static final int LAYOUT_FILTERDIALOG = 71;

  private static final int LAYOUT_FOOTERMENULAYOUT = 72;

  private static final int LAYOUT_FRAGMENTBILLINGADDRESS = 73;

  private static final int LAYOUT_FRAGMENTBOTTOMSHEET = 74;

  private static final int LAYOUT_FRAGMENTCONFIRMORDER = 75;

  private static final int LAYOUT_FRAGMENTDASHBOARDMYORDERS = 76;

  private static final int LAYOUT_FRAGMENTDASHBOARDMYREVIEW = 77;

  private static final int LAYOUT_FRAGMENTDASHBOARDMYADDRESS = 78;

  private static final int LAYOUT_FRAGMENTDETAILFEATURE = 79;

  private static final int LAYOUT_FRAGMENTFEATUREPRODUCT = 80;

  private static final int LAYOUT_FRAGMENTGUEST = 81;

  private static final int LAYOUT_FRAGMENTGUESTSHIPPINGADDRESS = 82;

  private static final int LAYOUT_FRAGMENTLATESTPRODUCT = 83;

  private static final int LAYOUT_FRAGMENTPAYMENTMETHOD = 84;

  private static final int LAYOUT_FRAGMENTPROFILE = 85;

  private static final int LAYOUT_FRAGMENTSHIPPINGADDRESS = 86;

  private static final int LAYOUT_FRAGMENTSHIPPINGMETHOD = 87;

  private static final int LAYOUT_GDPRNOTIFICATIONINFOLAYOUT = 88;

  private static final int LAYOUT_GRIDHOME = 89;

  private static final int LAYOUT_HOMELAYOUT = 90;

  private static final int LAYOUT_HOMEPRODUCTCAROUSAL = 91;

  private static final int LAYOUT_ITEMCART = 92;

  private static final int LAYOUT_ITEMCARTTOTAL = 93;

  private static final int LAYOUT_ITEMLINKSDOWNLOADABLEPRODUCT = 94;

  private static final int LAYOUT_ITEMMYDOWNLOADABLEPRODUCT = 95;

  private static final int LAYOUT_ITEMMYORDER = 96;

  private static final int LAYOUT_ITEMMYWISHLIST = 97;

  private static final int LAYOUT_ITEMNOTIFICATION = 98;

  private static final int LAYOUT_ITEMPRODUCTGRIDVIEW = 99;

  private static final int LAYOUT_ITEMPRODUCTLISTVIEW = 100;

  private static final int LAYOUT_ITEMVIEWPAGERBANNER = 101;

  private static final int LAYOUT_LANGUAGELAYOUT = 102;

  private static final int LAYOUT_LAYOUTPRODUCTDESCELV = 103;

  private static final int LAYOUT_LAYOUTVIEWPRODUCTSMALLIMAGEVIEW = 104;

  private static final int LAYOUT_LEFTNAVLAYOUT = 105;

  private static final int LAYOUT_MAINPRODUCTSINGLEVIEW = 106;

  private static final int LAYOUT_MOBIKULDIALOG = 107;

  private static final int LAYOUT_MYRETURNITEMS = 108;

  private static final int LAYOUT_NEWADDRESSLAYOUT = 109;

  private static final int LAYOUT_NOINTERNET = 110;

  private static final int LAYOUT_ORDEREDPRODUCTSINF = 111;

  private static final int LAYOUT_POINTANDTRANSACTIONDETAILS = 112;

  private static final int LAYOUT_PROCEEDTOCHECKOUTDIALOG = 113;

  private static final int LAYOUT_RECENTSEARCHITEMLAYOUT = 114;

  private static final int LAYOUT_RECENTSEARCHLAYOUT = 115;

  private static final int LAYOUT_RECENTVIEWPRODUCTLAYOUT = 116;

  private static final int LAYOUT_REVIEWLAYOUT = 117;

  private static final int LAYOUT_REVIEWORDER = 118;

  private static final int LAYOUT_REVIEWSINGLELAYOUT = 119;

  private static final int LAYOUT_SEARCHCATEGORYITEM = 120;

  private static final int LAYOUT_SEARCHCHILDITEM = 121;

  private static final int LAYOUT_SEARCHDIALOGACTIVITY = 122;

  private static final int LAYOUT_SEARCHLAYOUT = 123;

  private static final int LAYOUT_SEARCHPRODUCT = 124;

  private static final int LAYOUT_SEARCHPRODUCTITEMLAYOUT = 125;

  private static final int LAYOUT_SHOWMLDIALOG = 126;

  private static final int LAYOUT_SIMILARPRODUCTS = 127;

  private static final int LAYOUT_SINGLEDASHBOARDMYORDERSLAYOUT = 128;

  private static final int LAYOUT_SINGLEFEATURE = 129;

  private static final int LAYOUT_SINGLEFILTERPARENT = 130;

  private static final int LAYOUT_SINGLELAYOUTBRANDS = 131;

  private static final int LAYOUT_SORTITEMLAYOUT = 132;

  private static final int LAYOUT_SORTITEMLAYOUTFORMANUFACTURE = 133;

  private static final int LAYOUT_SORTITEMLAYOUTFORSEARCH = 134;

  private static final int LAYOUT_SORTERBOTTTOMSHEET = 135;

  private static final int LAYOUT_SUBCATEGORYGRID = 136;

  private static final int LAYOUT_SUBCATEGORYFRAGMENTLIST = 137;

  private static final int LAYOUT_SUBCATEGORYSINGLELAYOUT = 138;

  private static final int LAYOUT_SUBCATEGORYV3THEMELAYOUT = 139;

  private static final int LAYOUT_TABLEROW = 140;

  private static final int LAYOUT_TABLEROWLAYOUT = 141;

  private static final int LAYOUT_VIEWMOREITEMLAYOUT = 142;

  private static final int LAYOUT_VIEWPRODUCTSIMPLEBANNER = 143;

  private static final int LAYOUT_VIEWPRODUCTSIMPLEOPTIONLAYOUT = 144;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(144);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_accountinfo, LAYOUT_ACTIVITYACCOUNTINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_addr_book, LAYOUT_ACTIVITYADDRBOOK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_ar, LAYOUT_ACTIVITYAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_base_navigation_drawer, LAYOUT_ACTIVITYBASENAVIGATIONDRAWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_brower_by_brands, LAYOUT_ACTIVITYBROWERBYBRANDS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_camera_with_image, LAYOUT_ACTIVITYCAMERAWITHIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_cart, LAYOUT_ACTIVITYCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_category, LAYOUT_ACTIVITYCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_checkout2, LAYOUT_ACTIVITYCHECKOUT2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_cmspage, LAYOUT_ACTIVITYCMSPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_create_account, LAYOUT_ACTIVITYCREATEACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_dash_board_new, LAYOUT_ACTIVITYDASHBOARDNEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_dashboard, LAYOUT_ACTIVITYDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_ebs_payment_success, LAYOUT_ACTIVITYEBSPAYMENTSUCCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_file_explorer, LAYOUT_ACTIVITYFILEEXPLORER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_item_twopane, LAYOUT_ACTIVITYITEMTWOPANE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_my_downloads, LAYOUT_ACTIVITYMYDOWNLOADS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_my_orders, LAYOUT_ACTIVITYMYORDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_my_wishlist, LAYOUT_ACTIVITYMYWISHLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_myorder, LAYOUT_ACTIVITYMYORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_new_address, LAYOUT_ACTIVITYNEWADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_news_letter, LAYOUT_ACTIVITYNEWSLETTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_notification, LAYOUT_ACTIVITYNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_order_details, LAYOUT_ACTIVITYORDERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_order_placed, LAYOUT_ACTIVITYORDERPLACED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_other, LAYOUT_ACTIVITYOTHER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_product_details2, LAYOUT_ACTIVITYPRODUCTDETAILS2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_qr_category, LAYOUT_ACTIVITYQRCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_return_data, LAYOUT_ACTIVITYRETURNDATA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_return_order_request, LAYOUT_ACTIVITYRETURNORDERREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_review__list, LAYOUT_ACTIVITYREVIEWLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_review_details, LAYOUT_ACTIVITYREVIEWDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_splashscreen, LAYOUT_ACTIVITYSPLASHSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_sub_category_v3_theme, LAYOUT_ACTIVITYSUBCATEGORYV3THEME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_sub_category_v4_theme, LAYOUT_ACTIVITYSUBCATEGORYV4THEME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_subcategory, LAYOUT_ACTIVITYSUBCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_view_downloadable_product, LAYOUT_ACTIVITYVIEWDOWNLOADABLEPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_view_my_order, LAYOUT_ACTIVITYVIEWMYORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_view_my_return, LAYOUT_ACTIVITYVIEWMYRETURN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_view_pager_example, LAYOUT_ACTIVITYVIEWPAGEREXAMPLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_view_simple_product, LAYOUT_ACTIVITYVIEWSIMPLEPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_viewmore, LAYOUT_ACTIVITYVIEWMORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.activity_wallet, LAYOUT_ACTIVITYWALLET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.address_dashboard, LAYOUT_ADDRESSDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.address_items, LAYOUT_ADDRESSITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.become_a_seller, LAYOUT_BECOMEASELLER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.bottom_navigation, LAYOUT_BOTTOMNAVIGATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.carousal_layout, LAYOUT_CAROUSALLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.cart_option_layout, LAYOUT_CARTOPTIONLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.category_filter, LAYOUT_CATEGORYFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.checkout_bottom_sheet, LAYOUT_CHECKOUTBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.checkout_bottom_sheet_address_layout, LAYOUT_CHECKOUTBOTTOMSHEETADDRESSLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.choose_category, LAYOUT_CHOOSECATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.clickable_toast, LAYOUT_CLICKABLETOAST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.comment_to_orders, LAYOUT_COMMENTTOORDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.confirmorder_product_layout, LAYOUT_CONFIRMORDERPRODUCTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.currency_layout, LAYOUT_CURRENCYLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.custom_option_date_view, LAYOUT_CUSTOMOPTIONDATEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.custom_option_file_view, LAYOUT_CUSTOMOPTIONFILEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.custom_option_time_view, LAYOUT_CUSTOMOPTIONTIMEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.custom_order_view_page, LAYOUT_CUSTOMORDERVIEWPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.custom_spinner, LAYOUT_CUSTOMSPINNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.custom_text, LAYOUT_CUSTOMTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.custom_toast, LAYOUT_CUSTOMTOAST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.delivery_boy_layout, LAYOUT_DELIVERYBOYLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.deliveryboy_track, LAYOUT_DELIVERYBOYTRACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.edit_change_address, LAYOUT_EDITCHANGEADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.feature_layout, LAYOUT_FEATURELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.filter_dialog, LAYOUT_FILTERDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.footer_menu_layout, LAYOUT_FOOTERMENULAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_billing_address, LAYOUT_FRAGMENTBILLINGADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_bottom_sheet, LAYOUT_FRAGMENTBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_confirm_order, LAYOUT_FRAGMENTCONFIRMORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_dash_board_my_orders, LAYOUT_FRAGMENTDASHBOARDMYORDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_dash_board_my_review, LAYOUT_FRAGMENTDASHBOARDMYREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_dashboard_my_address, LAYOUT_FRAGMENTDASHBOARDMYADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_detail_feature, LAYOUT_FRAGMENTDETAILFEATURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_feature_product, LAYOUT_FRAGMENTFEATUREPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_guest, LAYOUT_FRAGMENTGUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_guest_shipping_address, LAYOUT_FRAGMENTGUESTSHIPPINGADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_latest_product, LAYOUT_FRAGMENTLATESTPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_payment_method, LAYOUT_FRAGMENTPAYMENTMETHOD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_shipping_address, LAYOUT_FRAGMENTSHIPPINGADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.fragment_shipping_method, LAYOUT_FRAGMENTSHIPPINGMETHOD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.gdpr_notification_info_layout, LAYOUT_GDPRNOTIFICATIONINFOLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.gridhome, LAYOUT_GRIDHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.home_layout, LAYOUT_HOMELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.home_product_carousal, LAYOUT_HOMEPRODUCTCAROUSAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.item_cart, LAYOUT_ITEMCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.item_cart_total, LAYOUT_ITEMCARTTOTAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.item_links_downloadable_product, LAYOUT_ITEMLINKSDOWNLOADABLEPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.item_my_downloadable_product, LAYOUT_ITEMMYDOWNLOADABLEPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.item_my_order, LAYOUT_ITEMMYORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.item_my_wishlist, LAYOUT_ITEMMYWISHLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.item_notification, LAYOUT_ITEMNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.item_product_grid_view, LAYOUT_ITEMPRODUCTGRIDVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.item_product_list_view, LAYOUT_ITEMPRODUCTLISTVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.item_view_pager_banner, LAYOUT_ITEMVIEWPAGERBANNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.language_layout, LAYOUT_LANGUAGELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.layout_product_desc_elv, LAYOUT_LAYOUTPRODUCTDESCELV);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.layout_view_product_small_image_view, LAYOUT_LAYOUTVIEWPRODUCTSMALLIMAGEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.left_nav_layout, LAYOUT_LEFTNAVLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.main_product_single_view, LAYOUT_MAINPRODUCTSINGLEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.mobikul_dialog, LAYOUT_MOBIKULDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.my_return_items, LAYOUT_MYRETURNITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.new_address_layout, LAYOUT_NEWADDRESSLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.no_internet, LAYOUT_NOINTERNET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.ordered_products_inf, LAYOUT_ORDEREDPRODUCTSINF);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.point_and_transaction_details, LAYOUT_POINTANDTRANSACTIONDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.proceed_to_checkout_dialog, LAYOUT_PROCEEDTOCHECKOUTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.recent_search_item_layout, LAYOUT_RECENTSEARCHITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.recent_search_layout, LAYOUT_RECENTSEARCHLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.recent_view_product_layout, LAYOUT_RECENTVIEWPRODUCTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.review_layout, LAYOUT_REVIEWLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.review_order, LAYOUT_REVIEWORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.review_single_layout, LAYOUT_REVIEWSINGLELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.search_category_item, LAYOUT_SEARCHCATEGORYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.search_child_item, LAYOUT_SEARCHCHILDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.search_dialog_activity, LAYOUT_SEARCHDIALOGACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.search_layout, LAYOUT_SEARCHLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.search_product, LAYOUT_SEARCHPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.search_product_item_layout, LAYOUT_SEARCHPRODUCTITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.show_ml_dialog, LAYOUT_SHOWMLDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.similar_products, LAYOUT_SIMILARPRODUCTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.single_dashboard_myorders_layout, LAYOUT_SINGLEDASHBOARDMYORDERSLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.single_feature, LAYOUT_SINGLEFEATURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.single_filter_parent, LAYOUT_SINGLEFILTERPARENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.single_layout_brands, LAYOUT_SINGLELAYOUTBRANDS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.sort_item_layout, LAYOUT_SORTITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.sort_item_layout_for_manufacture, LAYOUT_SORTITEMLAYOUTFORMANUFACTURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.sort_item_layout_for_search, LAYOUT_SORTITEMLAYOUTFORSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.sorter_botttom_sheet, LAYOUT_SORTERBOTTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.sub_category_grid, LAYOUT_SUBCATEGORYGRID);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.subcategory_fragment_list, LAYOUT_SUBCATEGORYFRAGMENTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.subcategory_single_layout, LAYOUT_SUBCATEGORYSINGLELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.subcategory_v3theme_layout, LAYOUT_SUBCATEGORYV3THEMELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.table_row, LAYOUT_TABLEROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.table_row_layout, LAYOUT_TABLEROWLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.view_more_item_layout, LAYOUT_VIEWMOREITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.view_product_simple_banner, LAYOUT_VIEWPRODUCTSIMPLEBANNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(webkul.opencart.mobikul.R.layout.view_product_simple_option_layout, LAYOUT_VIEWPRODUCTSIMPLEOPTIONLAYOUT);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYACCOUNTINFO: {
        if ("layout/activity_accountinfo_0".equals(tag)) {
          return new ActivityAccountinfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_accountinfo is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYADDRBOOK: {
        if ("layout/activity_addr_book_0".equals(tag)) {
          return new ActivityAddrBookBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_addr_book is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYAR: {
        if ("layout/activity_ar_0".equals(tag)) {
          return new ActivityArBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_ar is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYBASENAVIGATIONDRAWER: {
        if ("layout/activity_base_navigation_drawer_0".equals(tag)) {
          return new ActivityBaseNavigationDrawerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_base_navigation_drawer is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYBROWERBYBRANDS: {
        if ("layout/activity_brower_by_brands_0".equals(tag)) {
          return new ActivityBrowerByBrandsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_brower_by_brands is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCAMERAWITHIMAGE: {
        if ("layout/activity_camera_with_image_0".equals(tag)) {
          return new ActivityCameraWithImageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_camera_with_image is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCART: {
        if ("layout/activity_cart_0".equals(tag)) {
          return new ActivityCartBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_cart is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCATEGORY: {
        if ("layout/activity_category_0".equals(tag)) {
          return new ActivityCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_category is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCHECKOUT2: {
        if ("layout/activity_checkout2_0".equals(tag)) {
          return new ActivityCheckout2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_checkout2 is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCMSPAGE: {
        if ("layout/activity_cmspage_0".equals(tag)) {
          return new ActivityCmspageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_cmspage is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCREATEACCOUNT: {
        if ("layout/activity_create_account_0".equals(tag)) {
          return new ActivityCreateAccountBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_create_account is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDASHBOARDNEW: {
        if ("layout/activity_dash_board_new_0".equals(tag)) {
          return new ActivityDashBoardNewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_dash_board_new is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDASHBOARD: {
        if ("layout/activity_dashboard_0".equals(tag)) {
          return new ActivityDashboardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_dashboard is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYEBSPAYMENTSUCCESS: {
        if ("layout/activity_ebs_payment_success_0".equals(tag)) {
          return new ActivityEbsPaymentSuccessBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_ebs_payment_success is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYFILEEXPLORER: {
        if ("layout/activity_file_explorer_0".equals(tag)) {
          return new ActivityFileExplorerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_file_explorer is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYITEMTWOPANE: {
        if ("layout/activity_item_twopane_0".equals(tag)) {
          return new ActivityItemTwopaneBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_item_twopane is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYLOGIN: {
        if ("layout/activity_login_0".equals(tag)) {
          return new ActivityLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMAIN: {
        if ("layout/activity_main_0".equals(tag)) {
          return new ActivityMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMYDOWNLOADS: {
        if ("layout/activity_my_downloads_0".equals(tag)) {
          return new ActivityMyDownloadsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_my_downloads is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMYORDERS: {
        if ("layout/activity_my_orders_0".equals(tag)) {
          return new ActivityMyOrdersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_my_orders is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMYWISHLIST: {
        if ("layout/activity_my_wishlist_0".equals(tag)) {
          return new ActivityMyWishlistBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_my_wishlist is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMYORDER: {
        if ("layout/activity_myorder_0".equals(tag)) {
          return new ActivityMyorderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_myorder is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYNEWADDRESS: {
        if ("layout/activity_new_address_0".equals(tag)) {
          return new ActivityNewAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_new_address is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYNEWSLETTER: {
        if ("layout/activity_news_letter_0".equals(tag)) {
          return new ActivityNewsLetterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_news_letter is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYNOTIFICATION: {
        if ("layout/activity_notification_0".equals(tag)) {
          return new ActivityNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYORDERDETAILS: {
        if ("layout/activity_order_details_0".equals(tag)) {
          return new ActivityOrderDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_order_details is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYORDERPLACED: {
        if ("layout/activity_order_placed_0".equals(tag)) {
          return new ActivityOrderPlacedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_order_placed is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYOTHER: {
        if ("layout/activity_other_0".equals(tag)) {
          return new ActivityOtherBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_other is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPRODUCTDETAILS2: {
        if ("layout/activity_product_details2_0".equals(tag)) {
          return new ActivityProductDetails2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_product_details2 is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYQRCATEGORY: {
        if ("layout/activity_qr_category_0".equals(tag)) {
          return new ActivityQrCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_qr_category is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYRETURNDATA: {
        if ("layout/activity_return_data_0".equals(tag)) {
          return new ActivityReturnDataBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_return_data is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYRETURNORDERREQUEST: {
        if ("layout/activity_return_order_request_0".equals(tag)) {
          return new ActivityReturnOrderRequestBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_return_order_request is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYREVIEWLIST: {
        if ("layout/activity_review__list_0".equals(tag)) {
          return new ActivityReviewListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_review__list is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYREVIEWDETAILS: {
        if ("layout/activity_review_details_0".equals(tag)) {
          return new ActivityReviewDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_review_details is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSPLASHSCREEN: {
        if ("layout/activity_splashscreen_0".equals(tag)) {
          return new ActivitySplashscreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_splashscreen is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSUBCATEGORYV3THEME: {
        if ("layout/activity_sub_category_v3_theme_0".equals(tag)) {
          return new ActivitySubCategoryV3ThemeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_sub_category_v3_theme is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSUBCATEGORYV4THEME: {
        if ("layout/activity_sub_category_v4_theme_0".equals(tag)) {
          return new ActivitySubCategoryV4ThemeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_sub_category_v4_theme is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSUBCATEGORY: {
        if ("layout/activity_subcategory_0".equals(tag)) {
          return new ActivitySubcategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_subcategory is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYVIEWDOWNLOADABLEPRODUCT: {
        if ("layout/activity_view_downloadable_product_0".equals(tag)) {
          return new ActivityViewDownloadableProductBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_view_downloadable_product is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYVIEWMYORDER: {
        if ("layout/activity_view_my_order_0".equals(tag)) {
          return new ActivityViewMyOrderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_view_my_order is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYVIEWMYRETURN: {
        if ("layout/activity_view_my_return_0".equals(tag)) {
          return new ActivityViewMyReturnBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_view_my_return is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYVIEWPAGEREXAMPLE: {
        if ("layout/activity_view_pager_example_0".equals(tag)) {
          return new ActivityViewPagerExampleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_view_pager_example is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYVIEWSIMPLEPRODUCT: {
        if ("layout/activity_view_simple_product_0".equals(tag)) {
          return new ActivityViewSimpleProductBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_view_simple_product is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYVIEWMORE: {
        if ("layout/activity_viewmore_0".equals(tag)) {
          return new ActivityViewmoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_viewmore is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYWALLET: {
        if ("layout/activity_wallet_0".equals(tag)) {
          return new ActivityWalletBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_wallet is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDRESSDASHBOARD: {
        if ("layout/address_dashboard_0".equals(tag)) {
          return new AddressDashboardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for address_dashboard is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDRESSITEMS: {
        if ("layout/address_items_0".equals(tag)) {
          return new AddressItemsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for address_items is invalid. Received: " + tag);
      }
      case  LAYOUT_BECOMEASELLER: {
        if ("layout/become_a_seller_0".equals(tag)) {
          return new BecomeASellerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for become_a_seller is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMNAVIGATION: {
        if ("layout/bottom_navigation_0".equals(tag)) {
          return new BottomNavigationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottom_navigation is invalid. Received: " + tag);
      }
      case  LAYOUT_CAROUSALLAYOUT: {
        if ("layout/carousal_layout_0".equals(tag)) {
          return new CarousalLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for carousal_layout is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_CARTOPTIONLAYOUT: {
        if ("layout/cart_option_layout_0".equals(tag)) {
          return new CartOptionLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for cart_option_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_CATEGORYFILTER: {
        if ("layout/category_filter_0".equals(tag)) {
          return new CategoryFilterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for category_filter is invalid. Received: " + tag);
      }
      case  LAYOUT_CHECKOUTBOTTOMSHEET: {
        if ("layout/checkout_bottom_sheet_0".equals(tag)) {
          return new CheckoutBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for checkout_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_CHECKOUTBOTTOMSHEETADDRESSLAYOUT: {
        if ("layout/checkout_bottom_sheet_address_layout_0".equals(tag)) {
          return new CheckoutBottomSheetAddressLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for checkout_bottom_sheet_address_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_CHOOSECATEGORY: {
        if ("layout/choose_category_0".equals(tag)) {
          return new ChooseCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for choose_category is invalid. Received: " + tag);
      }
      case  LAYOUT_CLICKABLETOAST: {
        if ("layout/clickable_toast_0".equals(tag)) {
          return new ClickableToastBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for clickable_toast is invalid. Received: " + tag);
      }
      case  LAYOUT_COMMENTTOORDERS: {
        if ("layout/comment_to_orders_0".equals(tag)) {
          return new CommentToOrdersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for comment_to_orders is invalid. Received: " + tag);
      }
      case  LAYOUT_CONFIRMORDERPRODUCTLAYOUT: {
        if ("layout/confirmorder_product_layout_0".equals(tag)) {
          return new ConfirmorderProductLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for confirmorder_product_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_CURRENCYLAYOUT: {
        if ("layout/currency_layout_0".equals(tag)) {
          return new CurrencyLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for currency_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMOPTIONDATEVIEW: {
        if ("layout/custom_option_date_view_0".equals(tag)) {
          return new CustomOptionDateViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_option_date_view is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMOPTIONFILEVIEW: {
        if ("layout/custom_option_file_view_0".equals(tag)) {
          return new CustomOptionFileViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_option_file_view is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMOPTIONTIMEVIEW: {
        if ("layout/custom_option_time_view_0".equals(tag)) {
          return new CustomOptionTimeViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_option_time_view is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMORDERVIEWPAGE: {
        if ("layout/custom_order_view_page_0".equals(tag)) {
          return new CustomOrderViewPageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_order_view_page is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMSPINNER: {
        if ("layout/custom_spinner_0".equals(tag)) {
          return new CustomSpinnerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_spinner is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMTEXT: {
        if ("layout/custom_text_0".equals(tag)) {
          return new CustomTextBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_text is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMTOAST: {
        if ("layout/custom_toast_0".equals(tag)) {
          return new CustomToastBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_toast is invalid. Received: " + tag);
      }
      case  LAYOUT_DELIVERYBOYLAYOUT: {
        if ("layout/delivery_boy_layout_0".equals(tag)) {
          return new DeliveryBoyLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for delivery_boy_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_DELIVERYBOYTRACK: {
        if ("layout/deliveryboy_track_0".equals(tag)) {
          return new DeliveryboyTrackBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for deliveryboy_track is invalid. Received: " + tag);
      }
      case  LAYOUT_EDITCHANGEADDRESS: {
        if ("layout/edit_change_address_0".equals(tag)) {
          return new EditChangeAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for edit_change_address is invalid. Received: " + tag);
      }
      case  LAYOUT_FEATURELAYOUT: {
        if ("layout/feature_layout_0".equals(tag)) {
          return new FeatureLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for feature_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FILTERDIALOG: {
        if ("layout/filter_dialog_0".equals(tag)) {
          return new FilterDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for filter_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_FOOTERMENULAYOUT: {
        if ("layout/footer_menu_layout_0".equals(tag)) {
          return new FooterMenuLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for footer_menu_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTBILLINGADDRESS: {
        if ("layout/fragment_billing_address_0".equals(tag)) {
          return new FragmentBillingAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_billing_address is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTBOTTOMSHEET: {
        if ("layout/fragment_bottom_sheet_0".equals(tag)) {
          return new FragmentBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONFIRMORDER: {
        if ("layout/fragment_confirm_order_0".equals(tag)) {
          return new FragmentConfirmOrderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_confirm_order is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDASHBOARDMYORDERS: {
        if ("layout/fragment_dash_board_my_orders_0".equals(tag)) {
          return new FragmentDashBoardMyOrdersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_dash_board_my_orders is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDASHBOARDMYREVIEW: {
        if ("layout/fragment_dash_board_my_review_0".equals(tag)) {
          return new FragmentDashBoardMyReviewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_dash_board_my_review is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDASHBOARDMYADDRESS: {
        if ("layout/fragment_dashboard_my_address_0".equals(tag)) {
          return new FragmentDashboardMyAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_dashboard_my_address is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDETAILFEATURE: {
        if ("layout/fragment_detail_feature_0".equals(tag)) {
          return new FragmentDetailFeatureBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_detail_feature is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFEATUREPRODUCT: {
        if ("layout/fragment_feature_product_0".equals(tag)) {
          return new FragmentFeatureProductBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_feature_product is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTGUEST: {
        if ("layout/fragment_guest_0".equals(tag)) {
          return new FragmentGuestBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_guest is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTGUESTSHIPPINGADDRESS: {
        if ("layout/fragment_guest_shipping_address_0".equals(tag)) {
          return new FragmentGuestShippingAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_guest_shipping_address is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLATESTPRODUCT: {
        if ("layout/fragment_latest_product_0".equals(tag)) {
          return new FragmentLatestProductBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_latest_product is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPAYMENTMETHOD: {
        if ("layout/fragment_payment_method_0".equals(tag)) {
          return new FragmentPaymentMethodBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_payment_method is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROFILE: {
        if ("layout/fragment_profile_0".equals(tag)) {
          return new FragmentProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSHIPPINGADDRESS: {
        if ("layout/fragment_shipping_address_0".equals(tag)) {
          return new FragmentShippingAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_shipping_address is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSHIPPINGMETHOD: {
        if ("layout/fragment_shipping_method_0".equals(tag)) {
          return new FragmentShippingMethodBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_shipping_method is invalid. Received: " + tag);
      }
      case  LAYOUT_GDPRNOTIFICATIONINFOLAYOUT: {
        if ("layout/gdpr_notification_info_layout_0".equals(tag)) {
          return new GdprNotificationInfoLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for gdpr_notification_info_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_GRIDHOME: {
        if ("layout/gridhome_0".equals(tag)) {
          return new GridhomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for gridhome is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMELAYOUT: {
        if ("layout/home_layout_0".equals(tag)) {
          return new HomeLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMEPRODUCTCAROUSAL: {
        if ("layout/home_product_carousal_0".equals(tag)) {
          return new HomeProductCarousalBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_product_carousal is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCART: {
        if ("layout/item_cart_0".equals(tag)) {
          return new ItemCartBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_cart is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCARTTOTAL: {
        if ("layout/item_cart_total_0".equals(tag)) {
          return new ItemCartTotalBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_cart_total is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMLINKSDOWNLOADABLEPRODUCT: {
        if ("layout/item_links_downloadable_product_0".equals(tag)) {
          return new ItemLinksDownloadableProductBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_links_downloadable_product is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMYDOWNLOADABLEPRODUCT: {
        if ("layout/item_my_downloadable_product_0".equals(tag)) {
          return new ItemMyDownloadableProductBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_my_downloadable_product is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMYORDER: {
        if ("layout/item_my_order_0".equals(tag)) {
          return new ItemMyOrderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_my_order is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMYWISHLIST: {
        if ("layout/item_my_wishlist_0".equals(tag)) {
          return new ItemMyWishlistBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_my_wishlist is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMNOTIFICATION: {
        if ("layout/item_notification_0".equals(tag)) {
          return new ItemNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPRODUCTGRIDVIEW: {
        if ("layout/item_product_grid_view_0".equals(tag)) {
          return new ItemProductGridViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_product_grid_view is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPRODUCTLISTVIEW: {
        if ("layout/item_product_list_view_0".equals(tag)) {
          return new ItemProductListViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_product_list_view is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding2(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ITEMVIEWPAGERBANNER: {
        if ("layout/item_view_pager_banner_0".equals(tag)) {
          return new ItemViewPagerBannerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_view_pager_banner is invalid. Received: " + tag);
      }
      case  LAYOUT_LANGUAGELAYOUT: {
        if ("layout/language_layout_0".equals(tag)) {
          return new LanguageLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for language_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTPRODUCTDESCELV: {
        if ("layout/layout_product_desc_elv_0".equals(tag)) {
          return new LayoutProductDescElvBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_product_desc_elv is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTVIEWPRODUCTSMALLIMAGEVIEW: {
        if ("layout/layout_view_product_small_image_view_0".equals(tag)) {
          return new LayoutViewProductSmallImageViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_view_product_small_image_view is invalid. Received: " + tag);
      }
      case  LAYOUT_LEFTNAVLAYOUT: {
        if ("layout/left_nav_layout_0".equals(tag)) {
          return new LeftNavLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for left_nav_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_MAINPRODUCTSINGLEVIEW: {
        if ("layout/main_product_single_view_0".equals(tag)) {
          return new MainProductSingleViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for main_product_single_view is invalid. Received: " + tag);
      }
      case  LAYOUT_MOBIKULDIALOG: {
        if ("layout/mobikul_dialog_0".equals(tag)) {
          return new MobikulDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for mobikul_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_MYRETURNITEMS: {
        if ("layout/my_return_items_0".equals(tag)) {
          return new MyReturnItemsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for my_return_items is invalid. Received: " + tag);
      }
      case  LAYOUT_NEWADDRESSLAYOUT: {
        if ("layout/new_address_layout_0".equals(tag)) {
          return new NewAddressLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for new_address_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_NOINTERNET: {
        if ("layout/no_internet_0".equals(tag)) {
          return new NoInternetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for no_internet is invalid. Received: " + tag);
      }
      case  LAYOUT_ORDEREDPRODUCTSINF: {
        if ("layout/ordered_products_inf_0".equals(tag)) {
          return new OrderedProductsInfBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for ordered_products_inf is invalid. Received: " + tag);
      }
      case  LAYOUT_POINTANDTRANSACTIONDETAILS: {
        if ("layout/point_and_transaction_details_0".equals(tag)) {
          return new PointAndTransactionDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for point_and_transaction_details is invalid. Received: " + tag);
      }
      case  LAYOUT_PROCEEDTOCHECKOUTDIALOG: {
        if ("layout/proceed_to_checkout_dialog_0".equals(tag)) {
          return new ProceedToCheckoutDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for proceed_to_checkout_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_RECENTSEARCHITEMLAYOUT: {
        if ("layout/recent_search_item_layout_0".equals(tag)) {
          return new RecentSearchItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recent_search_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_RECENTSEARCHLAYOUT: {
        if ("layout/recent_search_layout_0".equals(tag)) {
          return new RecentSearchLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recent_search_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_RECENTVIEWPRODUCTLAYOUT: {
        if ("layout/recent_view_product_layout_0".equals(tag)) {
          return new RecentViewProductLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recent_view_product_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_REVIEWLAYOUT: {
        if ("layout/review_layout_0".equals(tag)) {
          return new ReviewLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for review_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_REVIEWORDER: {
        if ("layout/review_order_0".equals(tag)) {
          return new ReviewOrderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for review_order is invalid. Received: " + tag);
      }
      case  LAYOUT_REVIEWSINGLELAYOUT: {
        if ("layout/review_single_layout_0".equals(tag)) {
          return new ReviewSingleLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for review_single_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHCATEGORYITEM: {
        if ("layout/search_category_item_0".equals(tag)) {
          return new SearchCategoryItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_category_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHCHILDITEM: {
        if ("layout/search_child_item_0".equals(tag)) {
          return new SearchChildItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_child_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHDIALOGACTIVITY: {
        if ("layout/search_dialog_activity_0".equals(tag)) {
          return new SearchDialogActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_dialog_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHLAYOUT: {
        if ("layout/search_layout_0".equals(tag)) {
          return new SearchLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHPRODUCT: {
        if ("layout/search_product_0".equals(tag)) {
          return new SearchProductBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_product is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHPRODUCTITEMLAYOUT: {
        if ("layout/search_product_item_layout_0".equals(tag)) {
          return new SearchProductItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_product_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SHOWMLDIALOG: {
        if ("layout/show_ml_dialog_0".equals(tag)) {
          return new ShowMlDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for show_ml_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_SIMILARPRODUCTS: {
        if ("layout/similar_products_0".equals(tag)) {
          return new SimilarProductsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for similar_products is invalid. Received: " + tag);
      }
      case  LAYOUT_SINGLEDASHBOARDMYORDERSLAYOUT: {
        if ("layout/single_dashboard_myorders_layout_0".equals(tag)) {
          return new SingleDashboardMyordersLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for single_dashboard_myorders_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SINGLEFEATURE: {
        if ("layout/single_feature_0".equals(tag)) {
          return new SingleFeatureBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for single_feature is invalid. Received: " + tag);
      }
      case  LAYOUT_SINGLEFILTERPARENT: {
        if ("layout/single_filter_parent_0".equals(tag)) {
          return new SingleFilterParentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for single_filter_parent is invalid. Received: " + tag);
      }
      case  LAYOUT_SINGLELAYOUTBRANDS: {
        if ("layout/single_layout_brands_0".equals(tag)) {
          return new SingleLayoutBrandsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for single_layout_brands is invalid. Received: " + tag);
      }
      case  LAYOUT_SORTITEMLAYOUT: {
        if ("layout/sort_item_layout_0".equals(tag)) {
          return new SortItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for sort_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SORTITEMLAYOUTFORMANUFACTURE: {
        if ("layout/sort_item_layout_for_manufacture_0".equals(tag)) {
          return new SortItemLayoutForManufactureBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for sort_item_layout_for_manufacture is invalid. Received: " + tag);
      }
      case  LAYOUT_SORTITEMLAYOUTFORSEARCH: {
        if ("layout/sort_item_layout_for_search_0".equals(tag)) {
          return new SortItemLayoutForSearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for sort_item_layout_for_search is invalid. Received: " + tag);
      }
      case  LAYOUT_SORTERBOTTTOMSHEET: {
        if ("layout/sorter_botttom_sheet_0".equals(tag)) {
          return new SorterBotttomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for sorter_botttom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBCATEGORYGRID: {
        if ("layout/sub_category_grid_0".equals(tag)) {
          return new SubCategoryGridBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for sub_category_grid is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBCATEGORYFRAGMENTLIST: {
        if ("layout/subcategory_fragment_list_0".equals(tag)) {
          return new SubcategoryFragmentListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for subcategory_fragment_list is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBCATEGORYSINGLELAYOUT: {
        if ("layout/subcategory_single_layout_0".equals(tag)) {
          return new SubcategorySingleLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for subcategory_single_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBCATEGORYV3THEMELAYOUT: {
        if ("layout/subcategory_v3theme_layout_0".equals(tag)) {
          return new SubcategoryV3themeLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for subcategory_v3theme_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_TABLEROW: {
        if ("layout/table_row_0".equals(tag)) {
          return new TableRowBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for table_row is invalid. Received: " + tag);
      }
      case  LAYOUT_TABLEROWLAYOUT: {
        if ("layout/table_row_layout_0".equals(tag)) {
          return new TableRowLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for table_row_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWMOREITEMLAYOUT: {
        if ("layout/view_more_item_layout_0".equals(tag)) {
          return new ViewMoreItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_more_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWPRODUCTSIMPLEBANNER: {
        if ("layout/view_product_simple_banner_0".equals(tag)) {
          return new ViewProductSimpleBannerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_product_simple_banner is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWPRODUCTSIMPLEOPTIONLAYOUT: {
        if ("layout/view_product_simple_option_layout_0".equals(tag)) {
          return new ViewProductSimpleOptionLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_product_simple_option_layout is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
        case 2: {
          return internalGetViewDataBinding2(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(31);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "seller");
      sKeys.put(2, "handler");
      sKeys.put(3, "lastName");
      sKeys.put(4, "data");
      sKeys.put(5, "city");
      sKeys.put(6, "homedata");
      sKeys.put(7, "shopName");
      sKeys.put(8, "description");
      sKeys.put(9, "login");
      sKeys.put(10, "password");
      sKeys.put(11, "stateName");
      sKeys.put(12, "coutryName");
      sKeys.put(13, "confirmPassword");
      sKeys.put(14, "validPassword");
      sKeys.put(15, "company");
      sKeys.put(16, "fax");
      sKeys.put(17, "email");
      sKeys.put(18, "zip");
      sKeys.put(19, "address2");
      sKeys.put(20, "address1");
      sKeys.put(21, "telephone");
      sKeys.put(22, "userLogin");
      sKeys.put(23, "isLoading");
      sKeys.put(24, "firstName");
      sKeys.put(25, "build");
      sKeys.put(26, "handlers");
      sKeys.put(27, "validUsername");
      sKeys.put(28, "status");
      sKeys.put(29, "username");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(144);

    static {
      sKeys.put("layout/activity_accountinfo_0", webkul.opencart.mobikul.R.layout.activity_accountinfo);
      sKeys.put("layout/activity_addr_book_0", webkul.opencart.mobikul.R.layout.activity_addr_book);
      sKeys.put("layout/activity_ar_0", webkul.opencart.mobikul.R.layout.activity_ar);
      sKeys.put("layout/activity_base_navigation_drawer_0", webkul.opencart.mobikul.R.layout.activity_base_navigation_drawer);
      sKeys.put("layout/activity_brower_by_brands_0", webkul.opencart.mobikul.R.layout.activity_brower_by_brands);
      sKeys.put("layout/activity_camera_with_image_0", webkul.opencart.mobikul.R.layout.activity_camera_with_image);
      sKeys.put("layout/activity_cart_0", webkul.opencart.mobikul.R.layout.activity_cart);
      sKeys.put("layout/activity_category_0", webkul.opencart.mobikul.R.layout.activity_category);
      sKeys.put("layout/activity_checkout2_0", webkul.opencart.mobikul.R.layout.activity_checkout2);
      sKeys.put("layout/activity_cmspage_0", webkul.opencart.mobikul.R.layout.activity_cmspage);
      sKeys.put("layout/activity_create_account_0", webkul.opencart.mobikul.R.layout.activity_create_account);
      sKeys.put("layout/activity_dash_board_new_0", webkul.opencart.mobikul.R.layout.activity_dash_board_new);
      sKeys.put("layout/activity_dashboard_0", webkul.opencart.mobikul.R.layout.activity_dashboard);
      sKeys.put("layout/activity_ebs_payment_success_0", webkul.opencart.mobikul.R.layout.activity_ebs_payment_success);
      sKeys.put("layout/activity_file_explorer_0", webkul.opencart.mobikul.R.layout.activity_file_explorer);
      sKeys.put("layout/activity_item_twopane_0", webkul.opencart.mobikul.R.layout.activity_item_twopane);
      sKeys.put("layout/activity_login_0", webkul.opencart.mobikul.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", webkul.opencart.mobikul.R.layout.activity_main);
      sKeys.put("layout/activity_my_downloads_0", webkul.opencart.mobikul.R.layout.activity_my_downloads);
      sKeys.put("layout/activity_my_orders_0", webkul.opencart.mobikul.R.layout.activity_my_orders);
      sKeys.put("layout/activity_my_wishlist_0", webkul.opencart.mobikul.R.layout.activity_my_wishlist);
      sKeys.put("layout/activity_myorder_0", webkul.opencart.mobikul.R.layout.activity_myorder);
      sKeys.put("layout/activity_new_address_0", webkul.opencart.mobikul.R.layout.activity_new_address);
      sKeys.put("layout/activity_news_letter_0", webkul.opencart.mobikul.R.layout.activity_news_letter);
      sKeys.put("layout/activity_notification_0", webkul.opencart.mobikul.R.layout.activity_notification);
      sKeys.put("layout/activity_order_details_0", webkul.opencart.mobikul.R.layout.activity_order_details);
      sKeys.put("layout/activity_order_placed_0", webkul.opencart.mobikul.R.layout.activity_order_placed);
      sKeys.put("layout/activity_other_0", webkul.opencart.mobikul.R.layout.activity_other);
      sKeys.put("layout/activity_product_details2_0", webkul.opencart.mobikul.R.layout.activity_product_details2);
      sKeys.put("layout/activity_qr_category_0", webkul.opencart.mobikul.R.layout.activity_qr_category);
      sKeys.put("layout/activity_return_data_0", webkul.opencart.mobikul.R.layout.activity_return_data);
      sKeys.put("layout/activity_return_order_request_0", webkul.opencart.mobikul.R.layout.activity_return_order_request);
      sKeys.put("layout/activity_review__list_0", webkul.opencart.mobikul.R.layout.activity_review__list);
      sKeys.put("layout/activity_review_details_0", webkul.opencart.mobikul.R.layout.activity_review_details);
      sKeys.put("layout/activity_splashscreen_0", webkul.opencart.mobikul.R.layout.activity_splashscreen);
      sKeys.put("layout/activity_sub_category_v3_theme_0", webkul.opencart.mobikul.R.layout.activity_sub_category_v3_theme);
      sKeys.put("layout/activity_sub_category_v4_theme_0", webkul.opencart.mobikul.R.layout.activity_sub_category_v4_theme);
      sKeys.put("layout/activity_subcategory_0", webkul.opencart.mobikul.R.layout.activity_subcategory);
      sKeys.put("layout/activity_view_downloadable_product_0", webkul.opencart.mobikul.R.layout.activity_view_downloadable_product);
      sKeys.put("layout/activity_view_my_order_0", webkul.opencart.mobikul.R.layout.activity_view_my_order);
      sKeys.put("layout/activity_view_my_return_0", webkul.opencart.mobikul.R.layout.activity_view_my_return);
      sKeys.put("layout/activity_view_pager_example_0", webkul.opencart.mobikul.R.layout.activity_view_pager_example);
      sKeys.put("layout/activity_view_simple_product_0", webkul.opencart.mobikul.R.layout.activity_view_simple_product);
      sKeys.put("layout/activity_viewmore_0", webkul.opencart.mobikul.R.layout.activity_viewmore);
      sKeys.put("layout/activity_wallet_0", webkul.opencart.mobikul.R.layout.activity_wallet);
      sKeys.put("layout/address_dashboard_0", webkul.opencart.mobikul.R.layout.address_dashboard);
      sKeys.put("layout/address_items_0", webkul.opencart.mobikul.R.layout.address_items);
      sKeys.put("layout/become_a_seller_0", webkul.opencart.mobikul.R.layout.become_a_seller);
      sKeys.put("layout/bottom_navigation_0", webkul.opencart.mobikul.R.layout.bottom_navigation);
      sKeys.put("layout/carousal_layout_0", webkul.opencart.mobikul.R.layout.carousal_layout);
      sKeys.put("layout/cart_option_layout_0", webkul.opencart.mobikul.R.layout.cart_option_layout);
      sKeys.put("layout/category_filter_0", webkul.opencart.mobikul.R.layout.category_filter);
      sKeys.put("layout/checkout_bottom_sheet_0", webkul.opencart.mobikul.R.layout.checkout_bottom_sheet);
      sKeys.put("layout/checkout_bottom_sheet_address_layout_0", webkul.opencart.mobikul.R.layout.checkout_bottom_sheet_address_layout);
      sKeys.put("layout/choose_category_0", webkul.opencart.mobikul.R.layout.choose_category);
      sKeys.put("layout/clickable_toast_0", webkul.opencart.mobikul.R.layout.clickable_toast);
      sKeys.put("layout/comment_to_orders_0", webkul.opencart.mobikul.R.layout.comment_to_orders);
      sKeys.put("layout/confirmorder_product_layout_0", webkul.opencart.mobikul.R.layout.confirmorder_product_layout);
      sKeys.put("layout/currency_layout_0", webkul.opencart.mobikul.R.layout.currency_layout);
      sKeys.put("layout/custom_option_date_view_0", webkul.opencart.mobikul.R.layout.custom_option_date_view);
      sKeys.put("layout/custom_option_file_view_0", webkul.opencart.mobikul.R.layout.custom_option_file_view);
      sKeys.put("layout/custom_option_time_view_0", webkul.opencart.mobikul.R.layout.custom_option_time_view);
      sKeys.put("layout/custom_order_view_page_0", webkul.opencart.mobikul.R.layout.custom_order_view_page);
      sKeys.put("layout/custom_spinner_0", webkul.opencart.mobikul.R.layout.custom_spinner);
      sKeys.put("layout/custom_text_0", webkul.opencart.mobikul.R.layout.custom_text);
      sKeys.put("layout/custom_toast_0", webkul.opencart.mobikul.R.layout.custom_toast);
      sKeys.put("layout/delivery_boy_layout_0", webkul.opencart.mobikul.R.layout.delivery_boy_layout);
      sKeys.put("layout/deliveryboy_track_0", webkul.opencart.mobikul.R.layout.deliveryboy_track);
      sKeys.put("layout/edit_change_address_0", webkul.opencart.mobikul.R.layout.edit_change_address);
      sKeys.put("layout/feature_layout_0", webkul.opencart.mobikul.R.layout.feature_layout);
      sKeys.put("layout/filter_dialog_0", webkul.opencart.mobikul.R.layout.filter_dialog);
      sKeys.put("layout/footer_menu_layout_0", webkul.opencart.mobikul.R.layout.footer_menu_layout);
      sKeys.put("layout/fragment_billing_address_0", webkul.opencart.mobikul.R.layout.fragment_billing_address);
      sKeys.put("layout/fragment_bottom_sheet_0", webkul.opencart.mobikul.R.layout.fragment_bottom_sheet);
      sKeys.put("layout/fragment_confirm_order_0", webkul.opencart.mobikul.R.layout.fragment_confirm_order);
      sKeys.put("layout/fragment_dash_board_my_orders_0", webkul.opencart.mobikul.R.layout.fragment_dash_board_my_orders);
      sKeys.put("layout/fragment_dash_board_my_review_0", webkul.opencart.mobikul.R.layout.fragment_dash_board_my_review);
      sKeys.put("layout/fragment_dashboard_my_address_0", webkul.opencart.mobikul.R.layout.fragment_dashboard_my_address);
      sKeys.put("layout/fragment_detail_feature_0", webkul.opencart.mobikul.R.layout.fragment_detail_feature);
      sKeys.put("layout/fragment_feature_product_0", webkul.opencart.mobikul.R.layout.fragment_feature_product);
      sKeys.put("layout/fragment_guest_0", webkul.opencart.mobikul.R.layout.fragment_guest);
      sKeys.put("layout/fragment_guest_shipping_address_0", webkul.opencart.mobikul.R.layout.fragment_guest_shipping_address);
      sKeys.put("layout/fragment_latest_product_0", webkul.opencart.mobikul.R.layout.fragment_latest_product);
      sKeys.put("layout/fragment_payment_method_0", webkul.opencart.mobikul.R.layout.fragment_payment_method);
      sKeys.put("layout/fragment_profile_0", webkul.opencart.mobikul.R.layout.fragment_profile);
      sKeys.put("layout/fragment_shipping_address_0", webkul.opencart.mobikul.R.layout.fragment_shipping_address);
      sKeys.put("layout/fragment_shipping_method_0", webkul.opencart.mobikul.R.layout.fragment_shipping_method);
      sKeys.put("layout/gdpr_notification_info_layout_0", webkul.opencart.mobikul.R.layout.gdpr_notification_info_layout);
      sKeys.put("layout/gridhome_0", webkul.opencart.mobikul.R.layout.gridhome);
      sKeys.put("layout/home_layout_0", webkul.opencart.mobikul.R.layout.home_layout);
      sKeys.put("layout/home_product_carousal_0", webkul.opencart.mobikul.R.layout.home_product_carousal);
      sKeys.put("layout/item_cart_0", webkul.opencart.mobikul.R.layout.item_cart);
      sKeys.put("layout/item_cart_total_0", webkul.opencart.mobikul.R.layout.item_cart_total);
      sKeys.put("layout/item_links_downloadable_product_0", webkul.opencart.mobikul.R.layout.item_links_downloadable_product);
      sKeys.put("layout/item_my_downloadable_product_0", webkul.opencart.mobikul.R.layout.item_my_downloadable_product);
      sKeys.put("layout/item_my_order_0", webkul.opencart.mobikul.R.layout.item_my_order);
      sKeys.put("layout/item_my_wishlist_0", webkul.opencart.mobikul.R.layout.item_my_wishlist);
      sKeys.put("layout/item_notification_0", webkul.opencart.mobikul.R.layout.item_notification);
      sKeys.put("layout/item_product_grid_view_0", webkul.opencart.mobikul.R.layout.item_product_grid_view);
      sKeys.put("layout/item_product_list_view_0", webkul.opencart.mobikul.R.layout.item_product_list_view);
      sKeys.put("layout/item_view_pager_banner_0", webkul.opencart.mobikul.R.layout.item_view_pager_banner);
      sKeys.put("layout/language_layout_0", webkul.opencart.mobikul.R.layout.language_layout);
      sKeys.put("layout/layout_product_desc_elv_0", webkul.opencart.mobikul.R.layout.layout_product_desc_elv);
      sKeys.put("layout/layout_view_product_small_image_view_0", webkul.opencart.mobikul.R.layout.layout_view_product_small_image_view);
      sKeys.put("layout/left_nav_layout_0", webkul.opencart.mobikul.R.layout.left_nav_layout);
      sKeys.put("layout/main_product_single_view_0", webkul.opencart.mobikul.R.layout.main_product_single_view);
      sKeys.put("layout/mobikul_dialog_0", webkul.opencart.mobikul.R.layout.mobikul_dialog);
      sKeys.put("layout/my_return_items_0", webkul.opencart.mobikul.R.layout.my_return_items);
      sKeys.put("layout/new_address_layout_0", webkul.opencart.mobikul.R.layout.new_address_layout);
      sKeys.put("layout/no_internet_0", webkul.opencart.mobikul.R.layout.no_internet);
      sKeys.put("layout/ordered_products_inf_0", webkul.opencart.mobikul.R.layout.ordered_products_inf);
      sKeys.put("layout/point_and_transaction_details_0", webkul.opencart.mobikul.R.layout.point_and_transaction_details);
      sKeys.put("layout/proceed_to_checkout_dialog_0", webkul.opencart.mobikul.R.layout.proceed_to_checkout_dialog);
      sKeys.put("layout/recent_search_item_layout_0", webkul.opencart.mobikul.R.layout.recent_search_item_layout);
      sKeys.put("layout/recent_search_layout_0", webkul.opencart.mobikul.R.layout.recent_search_layout);
      sKeys.put("layout/recent_view_product_layout_0", webkul.opencart.mobikul.R.layout.recent_view_product_layout);
      sKeys.put("layout/review_layout_0", webkul.opencart.mobikul.R.layout.review_layout);
      sKeys.put("layout/review_order_0", webkul.opencart.mobikul.R.layout.review_order);
      sKeys.put("layout/review_single_layout_0", webkul.opencart.mobikul.R.layout.review_single_layout);
      sKeys.put("layout/search_category_item_0", webkul.opencart.mobikul.R.layout.search_category_item);
      sKeys.put("layout/search_child_item_0", webkul.opencart.mobikul.R.layout.search_child_item);
      sKeys.put("layout/search_dialog_activity_0", webkul.opencart.mobikul.R.layout.search_dialog_activity);
      sKeys.put("layout/search_layout_0", webkul.opencart.mobikul.R.layout.search_layout);
      sKeys.put("layout/search_product_0", webkul.opencart.mobikul.R.layout.search_product);
      sKeys.put("layout/search_product_item_layout_0", webkul.opencart.mobikul.R.layout.search_product_item_layout);
      sKeys.put("layout/show_ml_dialog_0", webkul.opencart.mobikul.R.layout.show_ml_dialog);
      sKeys.put("layout/similar_products_0", webkul.opencart.mobikul.R.layout.similar_products);
      sKeys.put("layout/single_dashboard_myorders_layout_0", webkul.opencart.mobikul.R.layout.single_dashboard_myorders_layout);
      sKeys.put("layout/single_feature_0", webkul.opencart.mobikul.R.layout.single_feature);
      sKeys.put("layout/single_filter_parent_0", webkul.opencart.mobikul.R.layout.single_filter_parent);
      sKeys.put("layout/single_layout_brands_0", webkul.opencart.mobikul.R.layout.single_layout_brands);
      sKeys.put("layout/sort_item_layout_0", webkul.opencart.mobikul.R.layout.sort_item_layout);
      sKeys.put("layout/sort_item_layout_for_manufacture_0", webkul.opencart.mobikul.R.layout.sort_item_layout_for_manufacture);
      sKeys.put("layout/sort_item_layout_for_search_0", webkul.opencart.mobikul.R.layout.sort_item_layout_for_search);
      sKeys.put("layout/sorter_botttom_sheet_0", webkul.opencart.mobikul.R.layout.sorter_botttom_sheet);
      sKeys.put("layout/sub_category_grid_0", webkul.opencart.mobikul.R.layout.sub_category_grid);
      sKeys.put("layout/subcategory_fragment_list_0", webkul.opencart.mobikul.R.layout.subcategory_fragment_list);
      sKeys.put("layout/subcategory_single_layout_0", webkul.opencart.mobikul.R.layout.subcategory_single_layout);
      sKeys.put("layout/subcategory_v3theme_layout_0", webkul.opencart.mobikul.R.layout.subcategory_v3theme_layout);
      sKeys.put("layout/table_row_0", webkul.opencart.mobikul.R.layout.table_row);
      sKeys.put("layout/table_row_layout_0", webkul.opencart.mobikul.R.layout.table_row_layout);
      sKeys.put("layout/view_more_item_layout_0", webkul.opencart.mobikul.R.layout.view_more_item_layout);
      sKeys.put("layout/view_product_simple_banner_0", webkul.opencart.mobikul.R.layout.view_product_simple_banner);
      sKeys.put("layout/view_product_simple_option_layout_0", webkul.opencart.mobikul.R.layout.view_product_simple_option_layout);
    }
  }
}
