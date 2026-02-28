public class Main {
    public static void main(String[] args) {

        System.out.println("=== Evaluation Pipeline ===");

        Submission sub =
                new Submission("23BCS1007", "public class A{}", "A.java");

        PlagiarismService plagiarism = new PlagiarismChecker();
        GradingService grading = new CodeGrader(new Rubric());
        ReportService reporting = new ReportWriter();

        EvaluationPipeline pipeline =
                new EvaluationPipeline(plagiarism, grading, reporting);

        pipeline.evaluate(sub);
    }
}