package com.alex.android.alexa.interfaces.playbackcontrol;

import com.alex.android.alexa.interfaces.AvsItem;

/**
 * Directive to replace all items in the queue, but leave the playing item
 *
 * {@link com.alex.android.alexa.data.Directive} response item type parsed so we can properly
 * deal with the incoming commands from the Alexa server.
 *
 * @author will on 5/21/2016.
 */
public class AvsReplaceEnqueuedItem extends AvsItem {
    public AvsReplaceEnqueuedItem(String token) {
        super(token);
    }
}
