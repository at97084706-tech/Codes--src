//Background Code For LGL Version 3.2

//Add New Import
import java.io.InputStream;
import android.graphics.drawable.Drawable;
import java.io.IOException;

//add in the box code
try {
			InputStream ims = context.getAssets().open("Example");//Name Image You
			Drawable d = Drawable.createFromStream(ims, null);
			mExpanded.setBackground(d);
		} catch(IOException ex) {
			
		}
		
//replace bg feature color
int MENU_FEATURE_BG_COLOR = Color.TRANSPARENT;

//Support Image Size [800 X 1000] For Original Size LGL Background