package md5f27b3c0837eb50b37f2eed62b6f819a8;


public class Activity
	extends md5741e60a80250ab7e7b6f039198ff6a46.AndroidGameActivity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Close_Contact.Activity, Close Contact, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Activity.class, __md_methods);
	}


	public Activity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Activity.class)
			mono.android.TypeManager.Activate ("Close_Contact.Activity, Close Contact, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
