



    package pages;

    public class AllPages {

        public AllPages() {
        }
        private UserHomePage userHomePage;
        private AdminDashboardPage adminDashboardPage;


        public UserHomePage userHomePage() {
            if (userHomePage== null) {
                userHomePage= new UserHomePage();
            }
            return userHomePage;
        }

        public AdminDashboardPage adminDashboardPage() {
            if (adminDashboardPage == null) {
                adminDashboardPage = new AdminDashboardPage();
            }
            return adminDashboardPage;
        }


    }



