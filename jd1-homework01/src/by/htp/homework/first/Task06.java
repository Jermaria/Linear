package by.htp.homework.first;

public class Task06 {

	// Написать код для решения задачи. В n малых бидонах 80 л молока. 
	// Сколько литров молока в m больших бидонах,
	// если в каждом большом бидоне на 12 л. больше, чем в малом?
		
	public static void main(String[] args) {
		
		int n;
		int m;
		
		int nVolumeSingle;
		int mVolumeSingle;
		int nVolumeTotal;
		int mVolumeTotal;
		
		n = 8;
		m = 9;
		nVolumeTotal = 80;
		
		nVolumeSingle = nVolumeTotal / n;
		mVolumeSingle = nVolumeSingle + 12;
		mVolumeTotal = mVolumeSingle * m;
		
		System.out.println(mVolumeTotal);
		
	}
}
