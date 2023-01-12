## Point

### Description

You have to represent a point in 2D space. Write a class with the name <b>Point</b>. The class needs two fields (instance variables) with name <b>x</b> and <b>y</b> of type <b>int</b>.

The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters <b>x</b> and <b>y</b> of type <b>int</b> and it needs to initialize the fields.

Write the following methods (instance methods):

<ul>
<li>Method named <b>getX</b> without any parameters, it needs to return the value of <b>x</b> field.</li>
<li>Method named <b>getY</b> without any parameters, it needs to return the value of <b>y</b> field.</li>
<li>Method named <b>setX</b> with one parameter of type <b>int</b>, it needs to set the value of the <b>x</b> field.</li>
<li>Method named <b>setY</b> with one parameter of type <b>int</b>, it needs to set the value of the <b>y</b> field.</li>
<li>Method named distance without any parameters, it needs to return the distance between <b>this</b> Point and Point 0,0 as double.</li>
<li>Method named distance with two parameters <b>x</b>, <b>y</b> both of type <b>int</b>, it needs to return the distance between <b>this</b> Point and Point <b>x</b>, <b>y</b> as <b>double</b>.</li>
<li>Method named distance with parameter another of type <b>Point</b>, it needs to return the distance between this <b>Point</b> and another <b>Point</b> as <b>double</b>.</li>
</ul>

To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:

d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)<br>
Where √ represents square root.

### Test Code

    Point first = new Point(6, 5);
    Point second = new Point(3, 1);
    System.out.println("distance(0,0)= " + first.distance());
    System.out.println("distance(second)= " + first.distance(second));
    System.out.println("distance(2,2)= " + first.distance(2, 2));
    Point point = new Point();
    System.out.println("distance()= " + point.distance());

### Output

    distance(0,0)= 7.810249675906654
    distance(second)= 5.0
    distance(2,2)= 5.0
    distance()= 0.0
