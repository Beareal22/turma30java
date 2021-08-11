package entities;

public class Ave {
	

	public class ave extends Pet{
		
		private boolean voa;

		/**
		 * @param raca
		 * @param voa 
		 */
		public ave (String raca, boolean voa) {
			super(raca);
			this.voa =voa;
		}
		
		public boolean getvoa() {
			return voa;
		}

		public void setvoa(boolean voa) {
			this.voa = voa;
		}
		

		public void voa() {
			if(voa == true) {
				System.out.println("alto");
			} else if (voa == false) {
				System.out.println("alto");
			}
		}

	}


}
