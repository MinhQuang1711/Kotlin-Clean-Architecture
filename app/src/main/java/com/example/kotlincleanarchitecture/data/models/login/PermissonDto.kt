package com.example.kotlincleanarchitecture.data.models.login

import com.google.gson.annotations.SerializedName

class PermissonDto (
    /// Hàng hoá
    ///
    @SerializedName("HasAllowViewProduct")
    val hasAllowViewProduct: Boolean?,

    @SerializedName("HasAllowCreateProduct")
    val hasAllowCreateProduct: Boolean?,

    @SerializedName("HasAllowUpdateProduct")
    val hasAllowUpdateProduct: Boolean?,

    @SerializedName("HasAllowDeleteProduct")
    val hasAllowDeleteProduct: Boolean?,

    /// Hoá đơn
    ///
    @SerializedName("HasAllowViewInvoice")
    val hasAllowViewInvoice: Boolean?,

    @SerializedName("HasAllowCreateInvoice")
    val hasAllowCreateInvoice: Boolean?,

    @SerializedName("HasAllowUpdateInvoice")
    val hasAllowUpdateInvoice: Boolean?,

    @SerializedName("HasAllowDeleteInvoice")
    val hasAllowDeleteInvoice: Boolean?

)