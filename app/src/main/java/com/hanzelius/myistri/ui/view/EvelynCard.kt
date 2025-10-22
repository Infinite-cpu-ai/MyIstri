package com.hanzelius.myistri.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hanzelius.myistri.R

@Composable
fun EvelynCard() {

    Image(
        painter = painterResource(R.drawable.agent_evelyn_chevalier_zzz_portrait),
        contentDescription = "Evelyn Card",
        modifier = Modifier
            .width(100.dp)
            .aspectRatio(0.675f)
            .clip(RoundedCornerShape(12.dp)),
        contentScale = ContentScale.Fit
    )
}

@Composable
@Preview(showBackground = true)
private fun MovieCardPreview() {
    EvelynCard()
}