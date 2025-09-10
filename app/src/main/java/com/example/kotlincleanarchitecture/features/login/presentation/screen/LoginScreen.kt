package com.example.kotlincleanarchitecture.features.login.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun LoginScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 14.dp)
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            OutlinedTextField(
                value = "",
                onValueChange = { it },
                label =  {
                    Text(
                        "Tài khoản",
                        style = TextStyle(fontSize = 12.sp),
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
            )

            OutlinedTextField(
                value = "",
                onValueChange = { it },
                label = {
                    Text(
                        "Nhập mật khẩu",
                        style = TextStyle(fontSize = 12.sp),
                        modifier = Modifier.padding(0.dp)
                    )
                },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth().padding(top= 15.dp),
                textStyle = TextStyle(
                    fontSize = 12.sp
                )
            )

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth().padding(top= 30.dp),
                shape= RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0XFF3A59D1)
                )
            )
            {
                Text(
                    text = "Đăng nhập",
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = Color.White,
                    ),
                )

            }


        }
    }

}
