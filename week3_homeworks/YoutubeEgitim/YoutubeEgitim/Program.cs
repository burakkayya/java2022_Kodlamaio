using System;

namespace YoutubeEgitim
{
    class Program
    {
        static void Main(string[] args)
        {

            CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
            customerManager.GiveCredit();
            Console.ReadLine();


        }
    }

    interface ICreditManager
    {
        void Calculate();
        void Save();

    }

    abstract class BaseCreditManager : ICreditManager
    {
        public abstract void Calculate();

        public virtual void Save()
        {
            Console.WriteLine("Kaydedildi.");
        }
    }

    class TeacherCreditManager : BaseCreditManager, ICreditManager
    {

        public override void Calculate()
        {
            Console.WriteLine("Öğretmen Kredisi hesaplandı.");
        }
        public override void Save()
        {
            Console.WriteLine("Öğretmen kredisi kaydediliyor.");
            base.Save();
        }
    }

    class MilitaryCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker Kredisi hesaplandı.");
        }
    }

    class Customer
    {
        public Customer()
        {
            Console.WriteLine("Müşteri nesnesi başlatıldı.");
        }
        public int Id { get; set; }
        public string City { get; set; }
    }

    class Company : Customer
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }
    class Person : Customer
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string NationalIdentity { get; set; }
    }
    class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;
        public CustomerManager(Customer customer, ICreditManager creditManager)
        {
            _customer = customer;
            _creditManager = creditManager;
        }
        public void Save()
        {
            Console.WriteLine("Müşteri Kaydedildi : ");
        }
        public void Delete()
        {
            Console.WriteLine("Müşteri Silindi : ");
        }
        public void GiveCredit()
        {
            _creditManager.Calculate();
            _creditManager.Save();
            Console.WriteLine("Kredi verildi.");
        }
    }
}
