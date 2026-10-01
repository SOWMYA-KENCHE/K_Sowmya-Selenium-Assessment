Action1()
{

	lr_start_transaction("1_LaunchUrl");

	web_set_sockets_option("SSL_VERSION", "AUTO");

	web_add_auto_header("Accept-Language", 
		"en-US,en;q=0.9");

/*Correlation comment - Do not change!  Original value='books' Name ='C_Category' Type ='Manual'*/
	web_reg_save_param_regexp(
		"ParamName=C_Category",
		"RegExp=a\\ href=\"/(.*?)\">Books\\\r",
		SEARCH_FILTERS,
		"Scope=Body",
		"IgnoreRedirections=No",
		LAST);

	web_url("demowebshop.tricentis.com", 
		"URL=https://demowebshop.tricentis.com/", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t76.inf", 
		"Mode=HTTP", 
		LAST);

	web_concurrent_start(NULL);

	web_url("styles.css", 
		"URL=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", 
		"Resource=1", 
		"RecContentType=text/css", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t77.inf", 
		LAST);

	web_url("default.css", 
		"URL=https://demowebshop.tricentis.com/Plugins/Widgets.NivoSlider/Content/nivoslider/themes/default/default.css", 
		"Resource=1", 
		"RecContentType=text/css", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t78.inf", 
		LAST);

	web_url("jquery.validate.unobtrusive.min.js", 
		"URL=https://demowebshop.tricentis.com/Scripts/jquery.validate.unobtrusive.min.js", 
		"Resource=1", 
		"RecContentType=application/x-javascript", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t79.inf", 
		LAST);

	web_url("responsive.css", 
		"URL=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/responsive.css", 
		"Resource=1", 
		"RecContentType=text/css", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t80.inf", 
		LAST);

	web_url("jquery-ui-1.10.3.custom.min.css", 
		"URL=https://demowebshop.tricentis.com/Content/jquery-ui-themes/smoothness/jquery-ui-1.10.3.custom.min.css", 
		"Resource=1", 
		"RecContentType=text/css", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t81.inf", 
		LAST);

	web_url("jquery-ui-1.10.3.custom.min.js", 
		"URL=https://demowebshop.tricentis.com/Scripts/jquery-ui-1.10.3.custom.min.js", 
		"Resource=1", 
		"RecContentType=application/x-javascript", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t82.inf", 
		LAST);

	web_url("jquery-migrate-1.2.1.min.js", 
		"URL=https://demowebshop.tricentis.com/Scripts/jquery-migrate-1.2.1.min.js", 
		"Resource=1", 
		"RecContentType=application/x-javascript", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t83.inf", 
		LAST);

	web_url("nivo-slider.css", 
		"URL=https://demowebshop.tricentis.com/Plugins/Widgets.NivoSlider/Content/nivoslider/nivo-slider.css", 
		"Resource=1", 
		"RecContentType=text/css", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t84.inf", 
		LAST);

	web_url("public.common.js", 
		"URL=https://demowebshop.tricentis.com/Scripts/public.common.js", 
		"Resource=1", 
		"RecContentType=application/x-javascript", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t85.inf", 
		LAST);

	web_url("public.ajaxcart.js", 
		"URL=https://demowebshop.tricentis.com/Scripts/public.ajaxcart.js", 
		"Resource=1", 
		"RecContentType=application/x-javascript", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t86.inf", 
		LAST);

	web_url("jquery.nivo.slider.js", 
		"URL=https://demowebshop.tricentis.com/Plugins/Widgets.NivoSlider/Scripts/jquery.nivo.slider.js", 
		"Resource=1", 
		"RecContentType=application/x-javascript", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t87.inf", 
		LAST);

	web_url("jquery-1.10.2.min.js", 
		"URL=https://demowebshop.tricentis.com/Scripts/jquery-1.10.2.min.js", 
		"Resource=1", 
		"RecContentType=application/x-javascript", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t88.inf", 
		LAST);

	web_url("jquery.validate.min.js", 
		"URL=https://demowebshop.tricentis.com/Scripts/jquery.validate.min.js", 
		"Resource=1", 
		"RecContentType=application/x-javascript", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t89.inf", 
		LAST);

	web_url("0000224_141-inch-laptop_125.png", 
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000224_141-inch-laptop_125.png", 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t90.inf", 
		LAST);

	web_url("0000201_build-your-own-expensive-computer_125.jpeg", 
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000201_build-your-own-expensive-computer_125.jpeg", 
		"Resource=1", 
		"RecContentType=image/jpeg", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t91.inf", 
		LAST);

	web_url("0000215.png", 
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000215.png", 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t92.inf", 
		LAST);

	web_url("0000031_build-your-own-computer_125.jpeg", 
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000031_build-your-own-computer_125.jpeg", 
		"Resource=1", 
		"RecContentType=image/jpeg", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t93.inf", 
		LAST);

	web_url("logo.png", 
		"URL=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/logo.png", 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t94.inf", 
		LAST);

	web_url("0000204_simple-computer_125.jpeg", 
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000204_simple-computer_125.jpeg", 
		"Resource=1", 
		"RecContentType=image/jpeg", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t95.inf", 
		LAST);

	web_url("0000015_25-virtual-gift-card_125.jpeg", 
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000015_25-virtual-gift-card_125.jpeg", 
		"Resource=1", 
		"RecContentType=image/jpeg", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t96.inf", 
		LAST);

	web_url("0000172_build-your-own-cheap-computer_125.jpeg", 
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000172_build-your-own-cheap-computer_125.jpeg", 
		"Resource=1", 
		"RecContentType=image/jpeg", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t102.inf", 
		LAST);

	web_url("0000240.png", 
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000240.png", 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t104.inf", 
		LAST);

	web_url("favicon.ico", 
		"URL=https://demowebshop.tricentis.com/favicon.ico", 
		"Resource=1", 
		"RecContentType=image/x-icon", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t105.inf", 
		LAST);

	web_concurrent_end(NULL);

	web_concurrent_start(NULL);

	web_url("bullet-right.gif", 
		"URL=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/bullet-right.gif", 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", 
		"Snapshot=t97.inf", 
		LAST);

	web_url("loading.gif", 
		"URL=https://demowebshop.tricentis.com/Plugins/Widgets.NivoSlider/Content/nivoslider/themes/default/loading.gif", 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=https://demowebshop.tricentis.com/Plugins/Widgets.NivoSlider/Content/nivoslider/themes/default/default.css", 
		"Snapshot=t98.inf", 
		LAST);

	web_url("top-menu-divider.png", 
		"URL=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/top-menu-divider.png", 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", 
		"Snapshot=t99.inf", 
		LAST);

	web_url("star-x-inactive.png", 
		"URL=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/star-x-inactive.png", 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", 
		"Snapshot=t100.inf", 
		LAST);

	web_url("star-x-active.png", 
		"URL=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/star-x-active.png", 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", 
		"Snapshot=t101.inf", 
		LAST);

	web_concurrent_end(NULL);

	web_url("ui-bg_flat_75_ffffff_40x100.png", 
		"URL=https://demowebshop.tricentis.com/Content/jquery-ui-themes/smoothness/images/ui-bg_flat_75_ffffff_40x100.png", 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=https://demowebshop.tricentis.com/Content/jquery-ui-themes/smoothness/jquery-ui-1.10.3.custom.min.css", 
		"Snapshot=t103.inf", 
		LAST);

	web_concurrent_start(NULL);

	web_url("arrows.png", 
		"URL=https://demowebshop.tricentis.com/Plugins/Widgets.NivoSlider/Content/nivoslider/themes/default/arrows.png", 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=https://demowebshop.tricentis.com/Plugins/Widgets.NivoSlider/Content/nivoslider/themes/default/default.css", 
		"Snapshot=t106.inf", 
		LAST);

	web_url("bullets.png", 
		"URL=https://demowebshop.tricentis.com/Plugins/Widgets.NivoSlider/Content/nivoslider/themes/default/bullets.png", 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=https://demowebshop.tricentis.com/Plugins/Widgets.NivoSlider/Content/nivoslider/themes/default/default.css", 
		"Snapshot=t107.inf", 
		LAST);

	web_concurrent_end(NULL);

	web_websocket_send("ID=1", 
		"Buffer={\"messageType\":\"hello\",\"broadcasts\":{\"remote-settings/monitor_changes\":\"\\\"1790862338556\\\"\"},\"use_webpush\":true}", 
		"IsBinary=0", 
		LAST);

	/*Connection ID 1 received buffer WebSocketReceive0*/

	lr_end_transaction("1_LaunchUrl",LR_AUTO);

	lr_think_time(27);

	lr_start_transaction("2_Register");

	web_url("Register", 
		"URL=https://demowebshop.tricentis.com/register", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demowebshop.tricentis.com/", 
		"Snapshot=t108.inf", 
		"Mode=HTTP", 
		LAST);

	web_url("top-menu-triangle.png", 
		"URL=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/top-menu-triangle.png", 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", 
		"Snapshot=t109.inf", 
		LAST);

	lr_think_time(23);

	web_submit_data("register", 
		"Action=https://demowebshop.tricentis.com/register", 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=https://demowebshop.tricentis.com/register", 
		"Snapshot=t110.inf", 
		"Mode=HTTP", 
		"EncodeAtSign=YES", 
		ITEMDATA, 
		"Name=__RequestVerificationToken", "Value=YUye5nRZ4d0-olxMKIZmWOR6pmLxxrC98Lozklq-RHI0jGoJ6KZDEMogw6n1pyS3jRAn4H5gWD5rNJTz9B0Fm4i0aDzQThqIzCFSzgKmQE01", ENDITEM, 
		"Name=Gender", "Value={P_Gender}", ENDITEM, 
		"Name=FirstName", "Value={P_FirstName}", ENDITEM, 
		"Name=LastName", "Value={P_LastName}", ENDITEM, 
		"Name=Email", "Value={P_Email}", ENDITEM, 
		"Name=Password", "Value={P_Password}", ENDITEM, 
		"Name=ConfirmPassword", "Value={P_confirmPassword}", ENDITEM, 
		"Name=register-button", "Value=Register", ENDITEM, 
		LAST);

	lr_end_transaction("2_Register",LR_AUTO);

	lr_think_time(15);

	lr_start_transaction("3_Category");

/*Correlation comment - Do not change!  Original value='fiction' Name ='C_product' Type ='Manual'*/
	web_reg_save_param_regexp(
		"ParamName=C_product",
		"RegExp=a\\ href=\"/(.*?)\"\\ title",
		"Ordinal=4",
		SEARCH_FILTERS,
		"Scope=Body",
		"IgnoreRedirections=No",
		LAST);

	web_url("Books",
		"URL=https://demowebshop.tricentis.com/{C_Category}",
		"Resource=0",
		"RecContentType=text/html",
		"Referer=https://demowebshop.tricentis.com/registerresult/1",
		"Snapshot=t112.inf",
		"Mode=HTTP",
		LAST);


	web_concurrent_start(NULL);

	web_url("0000209_copy-of-computing-and-internet-ex_125.jpeg",
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000209_copy-of-computing-and-internet-ex_125.jpeg",
		"Resource=1",
		"RecContentType=image/jpeg",
		"Referer=https://demowebshop.tricentis.com/{C_Category}",
		"Snapshot=t113.inf",
		LAST);

	web_url("0000133_fiction_125.jpeg",
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000133_{C_product}_125.jpeg",
		"Resource=1",
		"RecContentType=image/jpeg",
		"Referer=https://demowebshop.tricentis.com/{C_Category}",
		"Snapshot=t114.inf",
		LAST);

	web_url("0000130_computing-and-internet_125.jpeg",
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000130_computing-and-internet_125.jpeg",
		"Resource=1",
		"RecContentType=image/jpeg",
		"Referer=https://demowebshop.tricentis.com/{C_Category}",
		"Snapshot=t115.inf",
		LAST);

	web_url("0000131_health-book_125.jpeg",
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000131_health-book_125.jpeg",
		"Resource=1",
		"RecContentType=image/jpeg",
		"Referer=https://demowebshop.tricentis.com/{C_Category}",
		"Snapshot=t116.inf",
		LAST);

	web_url("0000132_science_125.jpeg",
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000132_science_125.jpeg",
		"Resource=1",
		"RecContentType=image/jpeg",
		"Referer=https://demowebshop.tricentis.com/{C_Category}",
		"Snapshot=t117.inf",
		LAST);

	web_url("0000208_fiction-ex_125.jpeg",
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000208_{C_product}-ex_125.jpeg",
		"Resource=1",
		"RecContentType=image/jpeg",
		"Referer=https://demowebshop.tricentis.com/{C_Category}",
		"Snapshot=t118.inf",
		LAST);

	web_concurrent_end(NULL);

	web_url("ico-arrow-r.gif", 
		"URL=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/ico-arrow-r.gif", 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", 
		"Snapshot=t119.inf", 
		LAST);

	lr_end_transaction("3_Category",LR_AUTO);

	lr_start_transaction("4_Product");

	web_add_auto_header("Accept-Language", 
		"en-US,en;q=0.9");

	lr_think_time(22);

	web_url("fiction",
		"URL=https://demowebshop.tricentis.com/{C_product}",
		"Resource=0",
		"RecContentType=text/html",
		"Referer=https://demowebshop.tricentis.com/{C_Category}",
		"Snapshot=t123.inf",
		"Mode=HTTP",
		LAST);

	web_concurrent_start(NULL);

	web_url("magnific-popup.css",
		"URL=https://demowebshop.tricentis.com/Content/magnific-popup/magnific-popup.css",
		"Resource=1",
		"RecContentType=text/css",
		"Referer=https://demowebshop.tricentis.com/{C_product}",
		"Snapshot=t124.inf",
		LAST);

	web_url("jquery.magnific-popup.js",
		"URL=https://demowebshop.tricentis.com/Scripts/jquery.magnific-popup.js",
		"Resource=1",
		"RecContentType=application/x-javascript",
		"Referer=https://demowebshop.tricentis.com/{C_product}",
		"Snapshot=t125.inf",
		LAST);

	web_url("0000133_fiction_300.jpeg",
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000133_{C_product}_300.jpeg",
		"Resource=1",
		"RecContentType=image/jpeg",
		"Referer=https://demowebshop.tricentis.com/{C_product}",
		"Snapshot=t126.inf",
		LAST);

	web_concurrent_end(NULL);

	lr_end_transaction("4_Product",LR_AUTO);

	lr_think_time(11);

	lr_start_transaction("5_Add to cart");

	web_url("ajax_loader_large.gif", 
		"URL=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/ajax_loader_large.gif", 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", 
		"Snapshot=t127.inf", 
		LAST);

	web_submit_data("1",
		"Action=https://demowebshop.tricentis.com/addproducttocart/details/45/1",
		"Method=POST",
		"RecContentType=application/json",
		"Referer=https://demowebshop.tricentis.com/{C_product}",
		"Snapshot=t128.inf",
		"Mode=HTTP",
		ITEMDATA,
		"Name=addtocart_45.EnteredQuantity", "Value=1", ENDITEM,
		LAST);

	web_concurrent_start(NULL);

	web_url("ico-close-notification-bar.png", 
		"URL=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/ico-close-notification-bar.png", 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", 
		"Snapshot=t129.inf", 
		LAST);

	web_url("0000133_fiction_47.jpeg",
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000133_{C_product}_47.jpeg",
		"Resource=1",
		"RecContentType=image/jpeg",
		"Referer=https://demowebshop.tricentis.com/{C_product}",
		"Snapshot=t130.inf",
		LAST);

	web_concurrent_end(NULL);

	lr_end_transaction("5_Add to cart",LR_AUTO);

	lr_think_time(17);

	lr_start_transaction("6_shopping cart");

	web_url("cart",
		"URL=https://demowebshop.tricentis.com/cart",
		"Resource=0",
		"RecContentType=text/html",
		"Referer=https://demowebshop.tricentis.com/{C_product}",
		"Snapshot=t131.inf",
		"Mode=HTTP",
		LAST);

	web_url("0000133_fiction_80.jpeg",
		"URL=https://demowebshop.tricentis.com/content/images/thumbs/0000133_{C_product}_80.jpeg",
		"Resource=1",
		"RecContentType=image/jpeg",
		"Referer=https://demowebshop.tricentis.com/cart",
		"Snapshot=t132.inf",
		LAST);

	lr_end_transaction("6_shopping cart",LR_AUTO);

	lr_think_time(13);

	lr_start_transaction("7_Checkout");

	web_url("ajax_loader_small.gif", 
		"URL=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/ajax_loader_small.gif", 
		"Resource=1", 
		"RecContentType=image/gif", 
		"Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", 
		"Snapshot=t133.inf", 
		LAST);

	web_url("getstatesbycountryid", 
		"URL=https://demowebshop.tricentis.com/country/getstatesbycountryid?countryId=41&addEmptyStateIfRequired=true&_=1790865381653", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/cart", 
		"Snapshot=t134.inf", 
		"Mode=HTTP", 
		LAST);

	web_submit_data("cart_2", 
		"Action=https://demowebshop.tricentis.com/cart", 
		"Method=POST", 
		"EncType=multipart/form-data", 
		"RecContentType=text/html", 
		"Referer=https://demowebshop.tricentis.com/cart", 
		"Snapshot=t135.inf", 
		"Mode=HTTP", 
		ITEMDATA, 
		"Name=itemquantity7122827", "Value=1", ENDITEM, 
		"Name=discountcouponcode", "Value=", ENDITEM, 
		"Name=giftcardcouponcode", "Value=", ENDITEM, 
		"Name=CountryId", "Value=41", ENDITEM, 
		"Name=StateProvinceId", "Value=0", ENDITEM, 
		"Name=ZipPostalCode", "Value=583102", ENDITEM, 
		"Name=termsofservice", "Value=on", ENDITEM, 
		"Name=checkout", "Value=checkout", ENDITEM, 
		LAST);

	web_concurrent_start(NULL);

	web_url("public.accordion.js", 
		"URL=https://demowebshop.tricentis.com/Scripts/public.accordion.js", 
		"Resource=1", 
		"RecContentType=application/x-javascript", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t136.inf", 
		LAST);

	web_url("public.onepagecheckout.js", 
		"URL=https://demowebshop.tricentis.com/Scripts/public.onepagecheckout.js", 
		"Resource=1", 
		"RecContentType=application/x-javascript", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t137.inf", 
		LAST);

	web_concurrent_end(NULL);

	lr_end_transaction("7_Checkout",LR_AUTO);

	lr_think_time(19);

	lr_start_transaction("8_Billing Address");

	web_url("getstatesbycountryid_2", 
		"URL=https://demowebshop.tricentis.com/country/getstatesbycountryid?countryId=41&addEmptyStateIfRequired=true&_=1790865406918", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t138.inf", 
		"Mode=HTTP", 
		LAST);

	lr_think_time(16);

	web_submit_data("OpcSaveBilling", 
		"Action=https://demowebshop.tricentis.com/checkout/OpcSaveBilling/", 
		"Method=POST", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t139.inf", 
		"Mode=HTTP", 
		"EncodeAtSign=YES", 
		ITEMDATA, 
		"Name=BillingNewAddress.Id", "Value=0", ENDITEM, 
		"Name=BillingNewAddress.FirstName", "Value={P_FirstName}", ENDITEM, 
		"Name=BillingNewAddress.LastName", "Value={P_LastName}", ENDITEM, 
		"Name=BillingNewAddress.Email", "Value={P_Email}", ENDITEM, 
		"Name=BillingNewAddress.Company", "Value=bitm", ENDITEM, 
		"Name=BillingNewAddress.CountryId", "Value=41", ENDITEM, 
		"Name=BillingNewAddress.StateProvinceId", "Value=0", ENDITEM, 
		"Name=BillingNewAddress.City", "Value=Ballari", ENDITEM, 
		"Name=BillingNewAddress.Address1", "Value=Ramanjineya nagar", ENDITEM, 
		"Name=BillingNewAddress.Address2", "Value=Belgal cross", ENDITEM, 
		"Name=BillingNewAddress.ZipPostalCode", "Value=583102", ENDITEM, 
		"Name=BillingNewAddress.PhoneNumber", "Value=08904975750", ENDITEM, 
		"Name=BillingNewAddress.FaxNumber", "Value=", ENDITEM, 
		LAST);

	web_url("arrow-up.png", 
		"URL=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/arrow-up.png", 
		"Resource=1", 
		"RecContentType=image/png", 
		"Referer=https://demowebshop.tricentis.com/Themes/DefaultClean/Content/styles.css", 
		"Snapshot=t140.inf", 
		LAST);

	web_submit_data("OpcSaveShipping", 
		"Action=https://demowebshop.tricentis.com/checkout/OpcSaveShipping/", 
		"Method=POST", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t141.inf", 
		"Mode=HTTP", 
		"EncodeAtSign=YES", 
		ITEMDATA, 
		"Name=shipping_address_id", "Value=5160342", ENDITEM, 
		"Name=ShippingNewAddress.Id", "Value=0", ENDITEM, 
		"Name=ShippingNewAddress.FirstName", "Value=kenche", ENDITEM, 
		"Name=ShippingNewAddress.LastName", "Value=sowmya ", ENDITEM, 
		"Name=ShippingNewAddress.Email", "Value=somkenche@gmail.com", ENDITEM, 
		"Name=ShippingNewAddress.Company", "Value=", ENDITEM, 
		"Name=ShippingNewAddress.CountryId", "Value=0", ENDITEM, 
		"Name=ShippingNewAddress.StateProvinceId", "Value=0", ENDITEM, 
		"Name=ShippingNewAddress.City", "Value=", ENDITEM, 
		"Name=ShippingNewAddress.Address1", "Value=", ENDITEM, 
		"Name=ShippingNewAddress.Address2", "Value=", ENDITEM, 
		"Name=ShippingNewAddress.ZipPostalCode", "Value=", ENDITEM, 
		"Name=ShippingNewAddress.PhoneNumber", "Value=", ENDITEM, 
		"Name=ShippingNewAddress.FaxNumber", "Value=", ENDITEM, 
		"Name=PickUpInStore", "Value=false", ENDITEM, 
		LAST);

	web_submit_data("OpcSaveShippingMethod", 
		"Action=https://demowebshop.tricentis.com/checkout/OpcSaveShippingMethod/", 
		"Method=POST", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t142.inf", 
		"Mode=HTTP", 
		ITEMDATA, 
		"Name=shippingoption", "Value=Ground___Shipping.FixedRate", ENDITEM, 
		LAST);

	web_concurrent_start(NULL);

	web_url("logo.jpg", 
		"URL=https://demowebshop.tricentis.com/plugins/Payments.CheckMoneyOrder/logo.jpg", 
		"Resource=1", 
		"RecContentType=image/jpeg", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t143.inf", 
		LAST);

	web_url("logo.jpg_2", 
		"URL=https://demowebshop.tricentis.com/plugins/Payments.CashOnDelivery/logo.jpg", 
		"Resource=1", 
		"RecContentType=image/jpeg", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t144.inf", 
		LAST);

	web_url("logo.jpg_3", 
		"URL=https://demowebshop.tricentis.com/plugins/Payments.PurchaseOrder/logo.jpg", 
		"Resource=1", 
		"RecContentType=image/jpeg", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t145.inf", 
		LAST);

	web_url("logo.jpg_4", 
		"URL=https://demowebshop.tricentis.com/plugins/Payments.Manual/logo.jpg", 
		"Resource=1", 
		"RecContentType=image/jpeg", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t146.inf", 
		LAST);

	web_concurrent_end(NULL);

	web_submit_data("OpcSavePaymentMethod", 
		"Action=https://demowebshop.tricentis.com/checkout/OpcSavePaymentMethod/", 
		"Method=POST", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t147.inf", 
		"Mode=HTTP", 
		ITEMDATA, 
		"Name=paymentmethod", "Value=Payments.CashOnDelivery", ENDITEM, 
		LAST);

	web_custom_request("OpcSavePaymentInfo", 
		"URL=https://demowebshop.tricentis.com/checkout/OpcSavePaymentInfo/", 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t148.inf", 
		"Mode=HTTP", 
		"EncType=", 
		LAST);

	lr_end_transaction("8_Billing Address",LR_AUTO);

	lr_think_time(10);

	lr_start_transaction("9_confirm");

	web_custom_request("OpcConfirmOrder", 
		"URL=https://demowebshop.tricentis.com/checkout/OpcConfirmOrder/", 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t149.inf", 
		"Mode=HTTP", 
		"EncType=", 
		LAST);

	web_url("completed", 
		"URL=https://demowebshop.tricentis.com/checkout/completed/", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demowebshop.tricentis.com/onepagecheckout", 
		"Snapshot=t150.inf", 
		"Mode=HTTP", 
		LAST);

	lr_end_transaction("9_confirm",LR_AUTO);

	return 0;
}