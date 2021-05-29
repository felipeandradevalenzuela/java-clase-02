import java.util.Arrays;
import java.util.Scanner;

public class StringUtil2
{
	public static void main(String[] args)
	{

		int[] intNumbArray = {1,2,3,4};
		String[] stringNumbArray = {"1","2","3","4"};
		String[] stringWordArray = {"Hola","mi","nombre","es","Felipee"};
        int opc = 1;
		Scanner scanner = new Scanner(System.in);
        // while(opc == 1)
        // {
            System.out.println("=============================================");
            System.out.println("1) replicate ");
            System.out.println("2) lpad ");
            System.out.println("3) toStringArray ");
            System.out.println("4) toIntArray ");
            System.out.println("5) maxLength ");
            System.out.println("6) lNormalize ");
            System.out.println("7) rpad ");
            System.out.println("8) ltrim ");
            System.out.println("9) rtrim ");
            System.out.println("10) trim ");
            System.out.println("11) indexOfN ");
            System.out.println("0) Salir ");
            System.out.print("Seleccione el ejercicio a visualizar: ");
            int ej = scanner.nextInt();
            switch(ej)
            {
                case 0:
                    opc = 2;
                break;
                case 1:
					System.out.print(replicate('x',5));
                break;
                case 2:
					System.out.print(lpad("5",3,'0'));
                break;
                case 3:
					toStringArray(intNumbArray);
                break;
                case 4:
					toIntArray(stringNumbArray);
                break;
                case 5:
					maxLength(stringWordArray);
                break;
				case 6:
					lNormalize(stringWordArray,'m');
                break;
				case 7:
				System.out.print(rpad("5",3,'0'));
				break;
				case 8:
				System.out.print(ltrim("   Hola Mundo!   "));
				break;
				case 9:
				System.out.print(rtrim("   Hola Mundo!   "));
				break;
				case 10:
				System.out.print(trim("   Hola Mundo!   "));
				break;
				case 11:
				System.out.print(indexOfN("Jhon|Paul|lGeorge|Ringo",'|',3));
				break;
                default:
                    System.out.println("No hay ejercicios asociados a esa Opción");
            }
        // }
        scanner.close();
	}
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n)
	{
		String word = Character.toString(c);

		for (int i = 0; i < n-1; i++) {
			word += c;
		}

		return word;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		String word = Character.toString(c);
		for (int i = 1; i < n-1; i++) {
			word+=c;
		}
		word+=s;
		return word;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y antecedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "500"
	public static String rpad(String s, int n, char c)
	{
		String word = Character.toString(c);
		for (int i = 1; i < n-1; i++) {
			word+=c;
		}
		return s+word;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		int arrLength = arr.length;
		String[] strArray = new String[arrLength];

		for (int i = 0; i < strArray.length; i++) 
		{
			strArray[i] = String.valueOf(arr[i]);	
		}
		// System.out.println("Tipo de arreglo entrante: "+arr);
		// System.out.println("Tipo de arreglo saliente: "+strArray);
		// System.out.println(Arrays.toString(strArray));
		return strArray;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int arrLength = arr.length;
		int[] intArray = new int[arrLength];

		for (int i = 0; i < intArray.length; i++) 
		{
			intArray[i] = Integer.parseInt(arr[i]);	
		}
		// System.out.println("Tipo de arreglo entrante: "+arr);
		// System.out.println("Tipo de arreglo saliente: "+intArray);
		// System.out.println(Arrays.toString(intArray));
		return intArray;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int flag =0,index=0;
		for (int i = 0; i < arr.length; i++) {
			int numb = arr[i].length();
			if(flag < numb)
			{
				flag = numb;
				index = i;
			}
		}
		// System.out.println("La palabra que mas letras contiene es: '"+ arr[index] + "' con " + flag + " caracteres");		
		return flag;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static String[] lNormalize(String arr[], char c)
	{
		int size = maxLength(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length() != size)
			{
				int dif = size - arr[i].length();
				for (int j = 0; j < dif; j++) {
					arr[i] = c+arr[i];
				}
			}
			// System.out.println(arr[i]);
		}
		return arr;
	}

	//Retorna una cadena identica a s
	//pero sin espacios a la izquierda
	public static String ltrim(String s)
	{
		int size = s.length();
		
		String newCadena = s.substring(0, size/2);
		newCadena = newCadena.trim();
		return newCadena+s.substring(size/2);
	}

	//Retorna una cadena identica a s
	//pero sin espacios a la derecha
	public static String rtrim(String s)
	{
		int size = s.length();
		
		String newCadena = s.substring(size/2, s.length());
		newCadena = newCadena.trim();
		return s.substring(0,size/2)+newCadena;
	}

	//Retorna una cadena identica a s
	//pero sin espacios a derecha ni izquierda
	public static String trim(String s)
	{
		return s.trim();
	}

	//Retorna la posicion de la n-ésima
	//ocurrencia del carácter c dentro de s,
	//o -1 si s no contiene a c
	//por ejemplo, si s = "Jhon|Paul|lGeorge|Ringo",
	//c = '|' y n =2, la función debe retornar la posición
	//de la segunda ocurrencia del carácter '|' (pipe) dentro de la 
	//cadena s. Que, en este caso es el 9
	public static int indexOfN(String s, char c, int n)
	{
		int charCount = 0;
		String arr[];
		arr = new String[s.length()];
		
		if (s.contains(""+c)) {
			for (int i = 0; i < s.length(); i++) {
				char letra = s.charAt(i);
				if (letra == ' ') 
					continue;

				if(letra == c)
				{
					arr[charCount] = Integer.toString(i);
					charCount++;

				}
			}
		}

		if (charCount >= n) {
			System.out.println(arr[n-1]);
			return Integer.parseInt(arr[n-1]);
		}
		return -1;
	}

	public static void Separador()
	{
		System.out.println("===================================");
	}
}
