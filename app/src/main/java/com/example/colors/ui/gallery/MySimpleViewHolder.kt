
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.colors.R

class MySimpleViewHolder(myItem: View) : RecyclerView.ViewHolder(myItem) {
    val cardView : CardView = myItem.findViewById(R.id.card_view)
}