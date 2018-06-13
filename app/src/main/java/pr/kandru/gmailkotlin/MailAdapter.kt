package pr.kandru.gmailkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

/**
 * Created by pkkan on 6/12/2018.
 */

class MailAdapter(context: Context) : RecyclerView.Adapter<MailAdapter.Email>() {
    private var c = context;
    override fun onBindViewHolder(holder: MailAdapter.Email, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MailAdapter.Email {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class Email(v: View): RecyclerView.ViewHolder(v) {
        private var view: View = v
        private lateinit var pic: View;
        private lateinit var title: View;
        private lateinit var info: View;
        private lateinit var time: View;

        init {

        }
    }
}
