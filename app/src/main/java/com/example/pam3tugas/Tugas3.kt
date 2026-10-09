package com.example.pam3tugas

import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun KartuMahasiswa(
    nama: Int,
    alamat: Int,
    warnaKartu: Int,
    warnaAlamat: Int,
    telp: Int? = null,
    namaMiring: Boolean = false
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = dimensionResource(id = R.dimen.card_spacing) / 2),
        shape = RoundedCornerShape(dimensionResource(id = R.dimen.card_radius)),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = warnaKartu)
        )
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = dimensionResource(id = R.dimen.card_padding_h),
                    vertical = dimensionResource(id = R.dimen.card_padding_v)
                ),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.logo_umy),
                modifier = Modifier.size(dimensionResource(id = R.dimen.logo_size))
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = dimensionResource(id = R.dimen.text_gap)),
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = stringResource(id = nama),
                    fontSize = dimensionResource(
                        id = if (namaMiring) R.dimen.text_name_script else R.dimen.text_name
                    ).value.sp,
                    fontWeight = if (namaMiring) FontWeight.Normal else FontWeight.Bold,
                    fontFamily = if (namaMiring) FontFamily.Cursive else FontFamily.Default,
                    color = colorResource(id = R.color.text_white)
                )
                if (telp != null) {
                    Text(
                        text = stringResource(id = telp),
                        fontSize = dimensionResource(id = R.dimen.text_detail).value.sp,
                        color = colorResource(id = R.color.text_cyan)
                    )
                }
                Text(
                    text = stringResource(id = alamat),
                    fontSize = dimensionResource(id = R.dimen.text_detail).value.sp,
                    color = colorResource(id = warnaAlamat)
                )

            }
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.logo_umy),
                modifier = Modifier.size(dimensionResource(id = R.dimen.logo_size))
            )
        }
    }
}

@Composable
fun Tugas3(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.bg_screen))
            .padding(
                start = dimensionResource(id = R.dimen.screen_padding),
                end = dimensionResource(id = R.dimen.screen_padding),
                top = dimensionResource(id = R.dimen.header_top),
                bottom = dimensionResource(id = R.dimen.footer_bottom)
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = dimensionResource(id = R.dimen.text_title).value.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = colorResource(id = R.color.text_primary)
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = dimensionResource(id = R.dimen.text_subtitle).value.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = colorResource(id = R.color.text_primary)
        )
    }
}