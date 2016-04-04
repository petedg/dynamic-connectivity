package us.awpwo;

public class UF {

	protected int[] id;
	private int [] sz;
	
	public UF(int N) {
		id = new int[N];
		for (int i = 0; i < N; ++i) {
			id[i] = i;
		}
		
		sz = new int[N];
	}
	
	public void union(int p, int q) {
	}
	
	public boolean connected(int p, int q) {
		return false;
	}
	
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	public void union(int p, int q) {
		 int pid = id[p];
		 int qid = id[q];
		 for (int i = 0; i < id.length; ++i) {
			 if (id[i] == pid) {
				 id[i] = qid;
			 }
		 }
	}
	
	private int root(int i) {
		 while (i != id[i]) {
		 i = id[i];
		 }
		 return i;
		}
		public boolean connected(int p, int q) {
		 return root(p) == root(q);
		}
		public void union(int p, int q) {
			int i = root(p);
			int j = root(q);
			if (i == j) return;
			 if (sz[i] < sz[j]) {
			 id[i] = j;
			 sz[j] += sz[i];
			 }
			else {
			 id[j] = i;
			 sz[i] += sz[j];
			}	 
		}
	
}