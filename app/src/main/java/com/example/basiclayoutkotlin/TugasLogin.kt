package com.example.basiclayoutkotlin

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiclayoutkotlin.ui.theme.BasicLayoutKotlinTheme

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        // 1. Gambar Background memenuhi layar
        Image(
            painter = painterResource(id = R.drawable.bg_login),
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // 2. Konten Teks dan Gambar bertumpuk ke bawah (Column) dan dapat di-scroll
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp, start = 16.dp, end = 16.dp, bottom = 24.dp)
                .verticalScroll(rememberScrollState())
        ) {
            // Judul Halaman
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )

            Text(
                text = "Ini adalah halaman login,",
                fontSize = 16.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(18.dp))

            // Logo Tengah
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = "Logo",
                modifier = Modifier.size(285.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))

            // Label & Informasi Mahasiswa
            Text(
                text = "Nama",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray
            )

            Text(
                text = "Rafky Ferdiansyah",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "20240140247",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(24.dp))



        }}}