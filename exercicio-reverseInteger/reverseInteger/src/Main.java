static void main(String [] args)
{
    System.out.println(reverseInteger(456));
    System.out.println(reverseInteger(8907));
    System.out.println(reverseInteger(1509));
}

static int reverseInteger(int x)
{
    int [] array;
    int size = 0, temp = x;
    long sum = 0;
    boolean sizeFound = false;

    if (x == Integer.MIN_VALUE)
    {
        return 0;
    }


    if(x < 0)
    {
        temp *= -1;
    }

    while(!sizeFound)
    {
        temp /= 10;
        if(temp <= 0)
        {
            sizeFound = true;
        }
        size++;
    }

    array = new int [size];
    temp = x;

    for(int i = 0; i < array.length; i++)
    {
        array[i] = temp % 10;
        temp /= 10;
    }

    temp = 0;
    for(int i = array.length - 1; i >= 0; i--)
    {
        sum += ((long)Math.pow(10, i) * array[temp]);
        temp++;
    }

    if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
    {
        return 0;
    }

    return (int) sum;
}

