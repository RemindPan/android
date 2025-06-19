package mega.privacy.android.app.presentation.meeting.chat.view.navigation.compose

import mega.privacy.android.shared.resources.R as sharedR
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import mega.privacy.android.legacy.core.ui.controls.dialogs.MegaDialog
import mega.privacy.android.shared.original.core.ui.theme.black
import mega.privacy.android.shared.original.core.ui.theme.white

@OptIn(ExperimentalMaterialApi::class, ExperimentalComposeUiApi::class)
@Composable
fun CreateOfflineDialog(
    titleResID: Int,
    onDismissRequest: () -> Unit = {},
) {

    val textColor = if (MaterialTheme.colors.isLight) {
        black
    } else {
        white
    }

    MegaDialog(
        properties = DialogProperties(usePlatformDefaultWidth = false),
        modifier = Modifier
            .padding(horizontal = 40.dp),
        onDismissRequest = onDismissRequest,
        titleString = stringResource(id = titleResID),
        fontWeight = FontWeight.W500,
        confirmButton = {},
        dismissButton = {
            Button(
                onClick = onDismissRequest,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent,
                ),
                modifier = Modifier.padding(all = 0.dp),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 0.dp,
                    disabledElevation = 0.dp,
                    hoveredElevation = 0.dp,
                    focusedElevation = 0.dp
                ),
            ) {
                Text(
                    stringResource(id = sharedR.string.general_dialog_cancel_button),
                    color = textColor
                )
            }
        }
    )
}
