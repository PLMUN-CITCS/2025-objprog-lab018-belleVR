using System;

class GradeCalculator
{
    
    public static int GetStudentScore()
    {
        Console.Write("Enter your score: ");
        int score = Convert.ToInt32(Console.ReadLine()); 
        return score; 
    }

    
    public static string CalculateGrade(int score)
    {
    
        if (score >= 90)
        {
            return "A"; 
        }
        else if (score >= 80)
        {
            return "B"; 
        }
        else if (score >= 70)
        {
            return "C"; 
        }
        else if (score >= 60)
        {
            return "D"; 
        }
        else
        {
            return "F"; 
        }
    }

    
    public static void Main(string[] args)
    {
    
        int score = GetStudentScore();
        
        
        string grade = CalculateGrade(score);
        
    
        Console.WriteLine("Your Grade is: " + grade);
    }
}