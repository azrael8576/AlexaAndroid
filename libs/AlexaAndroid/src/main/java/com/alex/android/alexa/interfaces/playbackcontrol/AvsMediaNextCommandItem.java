package com.alex.android.alexa.interfaces.playbackcontrol;

import com.alex.android.alexa.interfaces.AvsItem;

/**
 * {@link com.alex.android.alexa.data.Directive} to send a previous command to any app playing media
 *
 * This directive doesn't seem applicable to mobile applications
 *
 * @author will on 5/31/2016.
 */

public class AvsMediaNextCommandItem extends AvsItem {
    public AvsMediaNextCommandItem(String token) {
        super(token);
    }
}
