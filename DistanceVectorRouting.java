import java.util.Scanner;

/**
 * 
 */

/**
 * @author khasim
 *
 */
public class DistanceVectorRouting {

	/**
	 * @param args
	 */
	
	public static int graph[][];
	public static int adj[][];
	public static int v;
	public static int e;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Vertices ::");
		v = input.nextInt();
		System.out.print("Enter the number of Edges ::");
		e = input.nextInt();
		graph = new int[v][v];
		adj = new int[v][v]; 
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++){
				if(i==j) {	graph[i][i] = 0; adj[i][j] = i+1;}
				else {	graph[i][j] = 999; adj[i][j] = 100;}
			}
		}
		for(int i=0;i<e;i++) {
			System.out.print("Enter the source vertex for "+(i+1)+" edge::");
			int source = input.nextInt();
			System.out.print("Enter the destination vertex for "+(i+1)+" edge::");
			int des = input.nextInt();
			System.out.print("Enter the cost for "+(i+1)+" edge::");
			int cost = input.nextInt();
			graph[source-1][des-1] = cost ;
			graph[des-1][source-1] = cost ;
			adj[source-1][des-1] = des ;
			adj[des-1][source-1] = source ;
		}
		System.out.println("Initial Distance Vector Table");
		print_table();
		calcDistAndAdj();
		System.out.println("Final Distance Vector Table");
		print_table();
		System.out.println("Final Adjacent Vector Table");
		print_adjacent();
	}
	
	static void calcDistAndAdj(){
		for(int sharingVec=0, i=0; i<4*v; sharingVec++,i++) {
			sharingVec = i%v;
			for(int othrVec=0; othrVec<v; othrVec++) {
				if(sharingVec == othrVec) {	continue; }
				else {
					for(int ovLoopVar =0 ;  ovLoopVar < v; ovLoopVar++) {
						if(graph[othrVec][ovLoopVar] > graph[othrVec][sharingVec]+graph[sharingVec][ovLoopVar]) {
							graph[othrVec][ovLoopVar] = graph[othrVec][sharingVec]+graph[sharingVec][ovLoopVar];
							//graph[ovLoopVar][othrVec] = graph[othrVec][sharingVec]+graph[sharingVec][ovLoopVar];
							adj[othrVec][ovLoopVar] = adj[othrVec][sharingVec];  
						}
					}
				}
			}
		}
	}
	static void print_table(){
		for(int i = 0; i < v; i++) {
			for(int j = 0; j < v; j++) {
				System.out.print("Dist: " + graph[i][j] + "    ");
			}
			System.out.println();
		}
	 }
	
	static void print_adjacent(){
		for(int i = 0; i < v; i++) {
			for(int j = 0; j < v; j++) {
				System.out.print("Adj: " + adj[i][j] + "    ");
			}
			System.out.println();
		}
	 }
}
