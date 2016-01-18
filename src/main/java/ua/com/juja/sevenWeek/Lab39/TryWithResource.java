package ua.com.juja.sevenWeek.Lab39;

/**
 * Created by serzh on 1/15/16.
 */
public class TryWithResource {

    public static void twoResource(AutoCloseableFactory factoryA, AutoCloseableFactory factoryB, TryBody body) throws Throwable {
//        try (AutoCloseable a = factoryA.create();
//             AutoCloseable b = factoryB.create();
//        ) {
//            body.runBody();
//        }
        // --- create A ---
        Throwable myException = null;
        AutoCloseable resource = null;
        AutoCloseable resourceB = null;


        try {
            resource = factoryA.create();
            resourceB = factoryB.create();
        } catch (Throwable t) {
            throw t;
            try {
                body.runBody();

            } catch (Throwable bodyEx2) {

                try {

                    resource.close();
                    resourceB.close();

                } catch (Throwable closeEx) {

                    bodyEx2.addSuppressed(closeEx);

                }

                throw bodyEx2;

            }
            resource.close();
            resourceB.close();
        }

       /* try {
            resource = factoryA.create();
        } catch (Throwable bobodyEx) {
            throw bobodyEx;
        }
        try {
            resourceB = factoryB.create();
        } catch (Throwable bobodyEx1) {
            throw bobodyEx1;
        }

        try {
            body.runBody();

        } catch (Throwable bodyEx2) {

            try {

                resource.close();
                resourceB.close();

            } catch (Throwable closeEx) {

                bodyEx2.addSuppressed(closeEx);

            }

            throw bodyEx2;

        }
*/
/*        try {
            resource = factoryA.create();
            try {
                body.runBody();
            } catch (Throwable bodyEx2) {
                try {
                    resource.close();
                } catch (Throwable closeEx) {

                    bodyEx2.addSuppressed(closeEx);
                }
                throw bodyEx2;
            }
        } catch (Throwable bobodyEx) {
            throw bobodyEx;
        }
        resource.close();

        try {
            resourceB = factoryB.create();
            try {
                body.runBody();
            } catch (Throwable bodyEx2) {
                try {
                    resource.close();
                } catch (Throwable closeEx) {
                    bodyEx2.addSuppressed(closeEx);
                }
                throw bodyEx2;
            }
        } catch (Throwable bobodyEx1) {
            throw bobodyEx1;
        }
        resourceB.close();*/

       /* try {
            body.runBody();

        } catch (Throwable bodyEx2) {

            try {

                resource.close();
                resourceB.close();

            } catch (Throwable closeEx) {

                bodyEx2.addSuppressed(closeEx);

            }

            throw bodyEx2;

        }*/



        /*try {
            resource = factoryA.create();
            try {
                body.runBody();

            } catch (Throwable bodyEx2) {

                try {

                    resource.close();

                } catch (Throwable closeEx) {

                    bodyEx2.addSuppressed(closeEx);

                }

                throw bodyEx2;

            }
        } catch (Throwable bobodyEx) {
            throw bobodyEx;
        }
        try {
            resourceB = factoryB.create();
            try {
                body.runBody();

            } catch (Throwable bodyEx2) {

                try {

                    resource.close();
                    resourceB.close();

                } catch (Throwable closeEx) {

                    bodyEx2.addSuppressed(closeEx);

                }

                throw bodyEx2;

            }
        } catch (Throwable bobodyEx1) {
            throw bobodyEx1;
        }
        try {
            body.runBody();

        } catch (Throwable bodyEx2) {

            try {

                resource.close();
                resourceB.close();

            } catch (Throwable closeEx) {

                bodyEx2.addSuppressed(closeEx);

            }

            throw bodyEx2;

        }
*/


        // --- close ---
//    resource.close();
//    resourceB.close();
    }


    interface AutoCloseableFactory {
        public AutoCloseable create() throws Throwable;
    }

    interface TryBody {
        public void runBody() throws Throwable;
    }