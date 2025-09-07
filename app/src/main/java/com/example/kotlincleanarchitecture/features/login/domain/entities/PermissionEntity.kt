package com.example.kotlincleanarchitecture.features.login.domain.entities

import com.google.gson.annotations.SerializedName

class PermissionEntity (
    /// Hàng hoá
    ///
    val hasAllowViewProduct: Boolean?,
    val hasAllowCreateProduct: Boolean?,
    val hasAllowUpdateProduct: Boolean?,
    val hasAllowDeleteProduct: Boolean?,

    /// Hoá đơn
    ///
    val hasAllowViewInvoice: Boolean?,
    val hasAllowCreateInvoice: Boolean?,
    val hasAllowUpdateInvoice: Boolean?,
    val hasAllowDeleteInvoice: Boolean?
)