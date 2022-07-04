import java.util.ArrayList;
import java.util.Scanner;

public class quoteGenerator {

	public static void main(String[] args) {
		int quoteCount = 0;
		String[] motivationE = {"“All our dreams can come true, if we have the courage to pursue them.” – Walt Disney",
				"“The secret of getting ahead is getting started.” – Mark Twain","“I’ve missed more than 9,000 shots in my career. I’ve lost almost 300 games. 26 times I’ve been trusted to take the game winning shot and missed. I’ve failed over and over and over again in my life and that is why I succeed.” – Michael Jordan",
				"“Don’t limit yourself. Many people limit themselves to what they think they can do. You can go as far as your mind lets you. What you believe, remember, you can achieve.” – Mary Kay Ash","“The best time to plant a tree was 20 years ago. The second best time is now.” – Chinese Proverb", 
				"“Only the paranoid survive.” Andy Grove", "“It’s hard to beat a person who never gives up.” – Babe Ruth", "“I wake up every morning and think to myself, ‘how far can I push this company in the next 24 hours.’” – Leah Busque","“If people are doubting how far you can go, go so far that you can’t hear them anymore.” – Michele Ruiz", "“We need to accept that we won’t always make the right decisions, that we’ll screw up royally sometimes – understanding that failure is not the opposite of success, it’s part of success.” – Arianna Huffington", "“Write it. Shoot it. Publish it. Crochet it, sauté it, whatever. MAKE.” – Joss Whedon"  };
		String[] motOfDay = {"“You’ve gotta dance like there’s nobody watching, love like you’ll never be hurt, sing like there’s nobody listening, and live like it’s heaven on earth.” ― William W. Purkey","“Fairy tales are more than true: not because they tell us that dragons exist, but because they tell us that dragons can be beaten.”― Neil Gaiman","“Everything you can imagine is real.”― Pablo Picasso","“When one door of happiness closes, another opens; but often we look so long at the closed door that we do not see the one which has been opened for us.” ― Helen Keller","“Do one thing every day that scares you.”― Eleanor Roosevelt","“It’s no use going back to yesterday, because I was a different person then.”― Lewis Carroll","“Smart people learn from everything and everyone, average people from their experiences, stupid people already have all the answers.” – Socrates","“Do what you feel in your heart to be right – for you’ll be criticized anyway.”― Eleanor Roosevelt","“Happiness is not something ready made. It comes from your own actions.” ― Dalai Lama XIV","“Whatever you are, be a good one.” ― Abraham Lincoln"   };
		String[] qOfDay = {"“The same boiling water that softens the potato hardens the egg. It’s what you’re made of. Not the circumstances.” – Unknown", "“If we have the attitude that it’s going to be a great day it usually is.” – Catherine Pulsifier", "“You can either experience the pain of discipline or the pain of regret. The choice is yours.”  – Unknown", "“Impossible is just an opinion.” – Paulo Coelho", "“Your passion is waiting for your courage to catch up.” – Isabelle Lafleche","“Magic is believing in yourself. If you can make that happen, you can make anything happen.” – Johann Wolfgang Von Goethe","“If something is important enough, even if the odds are stacked against you, you should still do it.” – Elon Musk", "“Hold the vision, trust the process.” – Unknown","“Don’t be afraid to give up the good to go for the great.” – John D. Rockefeller", "“People who wonder if the glass is half empty or full miss the point. The glass is refillable.” – Unknown" };
		String[] MMQ = {"“Just another Magic Monday” – Unknown",
				"“One day or day one. You decide.” – Unknown",
				"“It’s Monday… time to motivate and make dreams and goals happen. Let’s go!” – Heather Stillufsen",
				"“It was a Monday and they walked on a tightrope to the sun.”― Marcus Zusak",
				"“Goodbye blue Monday.” ― Kurt Vonnegut",
				"“So. Monday. We meet again. We will never be friends—but maybe we can move past our mutual enmity toward a more-positive partnership.” ― Julio-Alexi Genao",
				"“When life gives you Monday, dip it in glitter and sparkle all day.” – Ella Woodword",
				"Monday c’est Mon Day",
				"All Motivation Mondays need are a little more coffee and a lot more mascara",
				"I’m alive, motivated and ready to slay the day #MONSLAY"};
		String[] hustle = {"“No one is to blame for your future situation but yourself. If you want to be successful, then become “Successful.”― Jaymin Shah",
				"“Things may come to those who wait, but only the things left by those who hustle.”― Abraham Lincoln",
				"“Everything comes to him who hustles while he waits.”― Thomas Edison",
				"“Every sucessful person in the world is a hustler one way or another. We all hustle to get where we need to be. Only a fool would sit around and wait on another man to feed him.” ― K’wan",
				"“Invest in your dreams. Grind now. Shine later.” – Unknown",
				"“Hustlers don’t sleep, they nap.” – Unknown",
				"“Greatness only comes before hustle in the dictionary.” – Ross Simmonds",
				"“Without hustle, talent will only carry you so far.” – Gary Vaynerchuk",
				"“Work like there is someone working twenty four hours a day to take it away from you.” – Mark Cuban",
				"“Hustle in silence and let your success make the noise.” – Unknown"};
		String[] motQEmploy = {"“We are what we repeatedly do. Excellence, then, is not an act, but a habit.” – Aristotle",
				"“If you’re offered a seat on a rocket ship, don’t ask what seat! Just get on.” – Sheryl Sandberg",
				"“I always did something I was a little not ready to do. I think that’s how you grow. When there’s that moment of ‘Wow, I’m not really sure I can do this,’ and you push through those moments, that’s when you have a breakthrough.” – Marissa Mayer",
				"“If you hear a voice within you say ‘you cannot paint,’ then by all means paint and that voice will be silenced.” – Vincent Van Gogh",
				"“How wonderful it is that nobody need wait a single moment before starting to improve the world.” – Anne Frank",
				"“Some people want it to happen, some wish it would happen, others make it happen.” – Michael Jordan",
				"“Great things are done by a series of small things brought together” – Vincent Van Gogh",
				"“If you hire people just because they can do a job, they’ll work for your money. But if you hire people who believe what you believe, they’ll work for you with blood and sweat and tears.” – Simon Sinek",
				"“Very often, a change of self is needed more than a change of scene.’ – A.C. Benson",
				"“Leaders can let you fail and yet not let you be a failure.” – Stanley McChrystal"};
		String[] superMotivQ = {"“The hard days are what make you stronger.” – Aly Raisman",
				"“If you believe it’ll work out, you’ll see opportunities. If you don’t believe it’ll work out, you’ll see obstacles.” – Wayne Dyer",
				"“Keep your eyes on the stars, and your feet on the ground.” – Theodore Roosevelt",
				"“You can waste your lives drawing lines. Or you can live your life crossing them.” – Shonda Rhimes",
				"“You’ve got to get up every morning with determination if you’re going to go to bed with satisfaction.” – George Lorimer",
				"“I now tried a new hypothesis: It was possible that I was more in charge of my happiness than I was allowing myself to be.” – Michelle Obama",
				"“In a gentle way, you can shake the world.” – Mahatma Gandhi",
				"“If opportunity doesn’t knock, build a door.” – Kurt Cobain",
				"“Don’t be pushed around by the fears in your mind. Be led by the dreams in your heart.” – Roy T. Bennett",
				"“Work hard in silence, let your success be the noise.” – Frank Ocean"};
		String[] motQWork = {"“Don’t say you don’t have enough time. You have exactly the same number of hours per day that were given to Helen Keller, Pasteur, Michelangelo, Mother Teresa, Leonardo Da Vinci, Thomas Jefferson, and Albert Einstein.” – H. Jackson Brown Jr.",
				"“Hard work beats talent when talent doesn’t work hard.” – Tim Notke",
				"“If everything seems to be under control, you’re not going fast enough.” – Mario Andretti",
				"“Opportunity is missed by most people because it is dressed in overalls and looks like work.” – Thomas Edison",
				"“The only difference between ordinary and extraordinary is that little extra.” – Jimmy Johnson",
				"“The best way to appreciate your job is to imagine yourself without one.” – Oscar Wilde",
				"“Unsuccessful people make their decisions based on their current situations. Successful people make their decisions based on where they want to be.” – Benjamin Hardy",
				"“Never stop doing your best just because someone doesn’t give you credit.” – Kamari aka Lyrikal",
				"“Work hard for what you want because it won’t come to you without a fight. You have to be strong and courageous and know that you can do anything you put your mind to. If somebody puts you down or criticizes you, just keep on believing in yourself and turn it into something positive.” – Leah LaBelle",
				"“Work hard, be kind, and amazing things will happen.” – Conan O’Brien"};
		String[] shortMotQ = {"“Dreams don’t work unless you do.” – John C. Maxwell",
				"“Go the extra mile. It’s never crowded there.” – Dr. Wayne D. Dyer",
				"“Keep your face always toward the sunshine – and shadows will fall behind you.” – Walt Whitman",
				"“What defines us is how well we rise after falling.” – Lionel from Maid in Manhattan Movie",
				"H.O.P.E. = Hold On. Pain Ends.",
				"Make each day your masterpiece. – John Wooden",
				"“Wherever you go, go with all your heart” – Confucius",
				"“Turn your wounds into wisdom” – Oprah",
				"“We can do anything we want to if we stick to it long enough.” – Helen Keller",
				"“Begin anywhere.” – John Cage"};
		String[] QforStudents = {"“I really appreciate people who correct me, because without them, I might have been repeating mistakes for a long time.” – Mufti Menk",
				"“Motivation comes from working on things we care about.” – Sheryl Sandberg",
				"“If today you are a little bit better than you were yesterday, then that’s enough.” – David A. Bednar",
				"“Education is the most powerful weapon which you can use to change the world.” – Nelson Mandela",
				"“If you can’t make a mistake you can’t make anything.” – Marva Collin",
				"“Practice makes progress not perfect.” – Unknown",
				"“You may be disappointed if you fail, but you’ll be doomed if you don’t try.” – Beverly Sills",
				"“Failure is the tuition you pay for success.” – Walter Brunell",
				"“If we wait until we’re ready, we’ll be waiting for the rest of our lives.” – Lemony Snicket",
				"“Study while others are sleeping; work while others are loafing; prepare while others are playing; and dream while others are wishing.” – William Arthur Ward"};
		ArrayList<String> list = new ArrayList<String>();
		Scanner total = new Scanner(System.in);
		try { 
			
		System.out.println("How many quotes would you like?");
		int quotes = total.nextInt();
		for(int x = 0; x < quotes; x++) {
		System.out.println();
		System.out.println("1.) Motivational Quotes for Entrepreneurs");
		System.out.println("2.) Motivational Quote for the Day");
		System.out.println("3.) Quote of the Day");
		System.out.println("4.) Monday Motivation Quotes");
		System.out.println("5.) Hustle Quotes");
		System.out.println("6.) Motivational Quotes for Employees");
		System.out.println("7.) Super Motivational Quotes");
		System.out.println("8.) Motivational Quotes for Work");
		System.out.println("9.) Short Motivational Quotes");
		System.out.println("10.) Motivational Quotes for Students");
		System.out.println("11.) See all your previous quotes.");
		System.out.println();
		System.out.println("Quotes Generator! Pick any type of quote to generate.");
		String k = total.next();
		if(k.equals("1")) {
			int i = (int)(Math.random()*10);
			System.out.println("The quote chosen for entrenpenurs is: " + motivationE[i]);
			list.add(motivationE[i]);
			quoteCount++;
		}
		if(k.equals("2")) {
			int i = (int)(Math.random()*10);
			System.out.println("Your motivation of the day is: " + motOfDay[i]);
			list.add(motOfDay[i]);
			quoteCount++;
		}
		if(k.equals("3")) {
			int i = (int)(Math.random()*10);
			System.out.println("Your quote of the day is: " + qOfDay[i]);
			list.add(qOfDay[i]);
			quoteCount++;
		}
		if(k.equals("4")) {
			int i = (int)(Math.random()*10);
			System.out.println("Your motivational quote for monday is: " + MMQ[i]);
			list.add(MMQ[i]);
			quoteCount++;
		}
		if(k.equals("5")) {
			int i = (int)(Math.random()*10);
			System.out.println("The hustle quote today is: " + hustle[i]);
			list.add(hustle[i]);
			quoteCount++;
		}
		if(k.equals("6")) {
			int i = (int)(Math.random()*10);
			System.out.println("Your motivational quote for empolyees is: " + motQEmploy[i]);
			list.add(motQEmploy[i]);
			quoteCount++;
		}
		if(k.equals("7")) {
			int i = (int)(Math.random()*10);
			System.out.println("Your super motivational quote today is: " + superMotivQ[i]);
			list.add(superMotivQ[i]);
			quoteCount++;
		}
		if(k.equals("8")) {
			int i = (int)(Math.random()*10);
			System.out.println("Your motivational quote for work today is: " + motQWork[i]);
			list.add(motQWork[i]);
			quoteCount++;
		}
		if(k.equals("9")) {
			int i = (int)(Math.random()*10);
			System.out.println("Your motivational quote for empolyees is: " + motQEmploy[i]);
			list.add(motQEmploy[i]);
			quoteCount++;
		}
		if(k.equals("10")) {
			int i = (int)(Math.random()*10);
			System.out.println("Your motivational quote for students is: " + QforStudents[i]);
			list.add(QforStudents[i]);
			quoteCount++;
		}
		}
		try {
		if(total.next().equals("11")) {
			for(int k = 0; k < list.size(); k++) {
				System.out.println(list.get(k));
			}
		}
		}catch(Exception e) {
			System.out.println("Type 11 to see all your quotes");
			
		}
		
		
		} catch (Exception e) {
			System.out.println("Enter an integer");
			total.next();
		}
		}
		
	}