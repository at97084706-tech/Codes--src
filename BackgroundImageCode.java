/*Background Image Code
For LGL Mod Menu*/

//******** Assets Method *********

import java.io.InputStream;
import android.graphics.drawable.Drawable;
import java.io.IOException;


try {
			InputStream ims = getAssets().open("aadil.png");
			Drawable d = Drawable.createFromStream(ims, null);
			mExpanded.setBackground(d);
		} catch(IOException ex) {
			
		}
		
		
//********* Base64 Method **********

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;


byte[] bgdecode = Base64.decode(Background(), 0);
Bitmap backgroundbitmap = BitmapFactory.decodeByteArray(bgdecode,0,bgdecode.length);
        BitmapDrawable bgimage = new BitmapDrawable(backgroundbitmap);
		mExpanded.setBackground(bgimage);
		
		
//Code by Aadil Mods
Youtube = https://youtube.com/@AadilMods
Telegram = https://t.me/Gamer_Aadil