package com.kondwani.project.shopit.api;


import com.kondwani.project.shopit.model.Category;
import com.kondwani.project.shopit.model.CategoryResult;
import com.kondwani.project.shopit.model.Order;
import com.kondwani.project.shopit.model.OrderItem;
import com.kondwani.project.shopit.model.OrdersResult;
import com.kondwani.project.shopit.model.PlaceOrder;
import com.kondwani.project.shopit.model.ProductResult;
import com.kondwani.project.shopit.model.Token;
import com.kondwani.project.shopit.model.User;
import com.kondwani.project.shopit.model.UserResult;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;



public interface RestService {

    @POST("api/v1/register")
    Call<UserResult> register(@Body User user);

    @POST("api/v1/login")
    Call<UserResult> login(@Body User user);

    @POST("api/v1/forgot_password")
    Call<UserResult> forgotPassword(@Body User user);

    @POST("api/v1/reset_password")
    Call<UserResult> resetPassword(@Body User user);

    @POST("api/v1/allcategory")
    Call<CategoryResult> allCategory(@Body Token token);

    @POST("api/v1/newProduct")
    Call<ProductResult> newProducts(@Body Token token);

    @POST("api/v1/homepage")
    Call<ProductResult> popularProducts(@Body Token token);

    @POST("api/v1/getlist")
    Call<ProductResult> getCategoryProduct(@Body Category category);

    @POST("api/v1/placeorder")
    Call<OrdersResult> confirmPlaceOrder(@Body PlaceOrder placeOrder);

    @POST("api/v1/orderDetails")
    Call<OrdersResult> orderDetails(@Body Order order);

    @POST("api/v1/updateUser")
    Call<UserResult> updateUser(@Body User user);

    @GET("api/v1/product/search")
    Call<ProductResult> searchProduct(@Query("s") String search);

    @POST("api/v1/singleOrderDetails")
    Call<OrdersResult> getOrderItems(@Body OrderItem orderItem);
}
