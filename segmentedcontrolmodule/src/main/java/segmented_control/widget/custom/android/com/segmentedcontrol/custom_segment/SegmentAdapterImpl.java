package segmented_control.widget.custom.android.com.segmentedcontrol.custom_segment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import segmented_control.widget.custom.android.com.segmentedcontrol.item_row_column.SegmentAdapter;

/**
 * Created by Robert Apikyan on 9/8/2017.
 */

public class SegmentAdapterImpl extends SegmentAdapter<CharSequence, SegmentViewHolderImpl> {

    @NonNull
    @Override
    protected SegmentViewHolderImpl onCreateViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return new SegmentViewHolderImpl(layoutInflater.inflate(segmented_control.widget.R.layout.item_segment_impl, null));
    }
}
