package ch15.exercise1;

class AddLowerCaseJob implements Runnable {
  private final Data data;
  AddLowerCaseJob(Data data) {
    this.data = data;
  }

  public void run() {
    char letter = 'a';

    for (int i = 0; i < 26; i++) {
      data.addLetter(letter++);
      try {
        Thread.sleep(50);
      } catch (InterruptedException ignored) {
      }
    }
    System.out.println(Thread.currentThread().getName() + data.getLetters());
    System.out.println(Thread.currentThread().getName() + " getLetters().size() = " + data.getLetters().size());
  }

}
