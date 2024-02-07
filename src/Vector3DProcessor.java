//Разработайте класс Vector3DProcessor с методами:
//1) сумма и разность двух векторов,
//2) скалярное произведение двух векторов,
//3) векторное произведение двух векторов,
//4) проверка коллинеарности двух векторов.
public class Vector3DProcessor {
    public Vector3D sumVector (Vector3D v1, Vector3D v2)
    {
        Point3D point1 = new Point3D(v1.getPoint1().getX() + v2.getPoint1().getX(),v1.getPoint1().getY() + v2.getPoint1().getY(),v1.getPoint1().getZ() + v2.getPoint1().getZ());
        Point3D point2 = new Point3D(v1.getPoint2().getX() + v2.getPoint2().getX(),v1.getPoint2().getY() + v2.getPoint2().getY(),v1.getPoint2().getZ() + v2.getPoint2().getZ());
        return new Vector3D(point1, point2);
        // point 1 - первая точка нового вектора, она получилась из сложения по координатам двух векторов getX()

    }
    public Vector3D rasnoctVector (Vector3D v1, Vector3D v2)
    {
        Point3D point1 = new Point3D(v1.getPoint1().getX() - v2.getPoint1().getX(),v1.getPoint1().getY() - v2.getPoint1().getY(),v1.getPoint1().getZ() - v2.getPoint1().getZ());
        Point3D point2 = new Point3D(v1.getPoint2().getX() - v2.getPoint2().getX(),v1.getPoint2().getY() - v2.getPoint2().getY(),v1.getPoint2().getZ() - v2.getPoint2().getZ());
        return new Vector3D(point1, point2);
        // point 1 - первая точка нового вектора, она получилась из сложения по координатам двух векторов getX()

    }
    public double scalVector (Vector3D v1, Vector3D v2)
    {
        return (v1.getPoint1().getX()-v1.getPoint2().getX() * v2.getPoint1().getX()-v2.getPoint2().getX()
        + v1.getPoint1().getY()-v1.getPoint2().getY() * v2.getPoint1().getY()-v2.getPoint2().getY()
        + v1.getPoint1().getZ()-v1.getPoint2().getZ() * v2.getPoint1().getZ()-v2.getPoint2().getZ());
    }
    public static void main(String[] args){
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(1, 2, 3);
        Point3D p3 = new Point3D();
        Vector3D v1 = new Vector3D(p1,p2);
        Vector3D v2 = new Vector3D(p3,p1);

        Vector3DProcessor vector3DProcessor = new Vector3DProcessor();
        Vector3D sumV = vector3DProcessor.sumVector(v1,v2);
        sumV.getPoint1().print();
        sumV.getPoint2().print();
        Vector3D rasnV = vector3DProcessor.rasnoctVector(v1,v2);
        rasnV.getPoint1().print();
        rasnV.getPoint2().print();
        System.out.println(vector3DProcessor.scalVector(v1,v2));
    }
}
