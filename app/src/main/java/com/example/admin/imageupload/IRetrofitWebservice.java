package com.example.admin.imageupload;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface IRetrofitWebservice {

    @Multipart
    @POST("apis/1/user/OperatorDLInsertUpdate")
    Call<ServerResponse> uploadFile(@Part("SessionToken") RequestBody SessionToken,@Part("UserId") RequestBody UserId,@Part("dlNumber") RequestBody dlNumber,
                                    @Part("issuedDate") RequestBody issuedDate,@Part("expiryDate") RequestBody expiryDate,@Part("Country") RequestBody Country,
                                    @Part("State") RequestBody State,@Part("DL_front_base64string") RequestBody DL_front_base64string,@Part("DL_back_base64string") RequestBody DL_back_base64string);
}
