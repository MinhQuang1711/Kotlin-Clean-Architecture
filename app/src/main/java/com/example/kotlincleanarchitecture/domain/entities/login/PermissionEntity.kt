package com.example.kotlincleanarchitecture.domain.entities.login

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