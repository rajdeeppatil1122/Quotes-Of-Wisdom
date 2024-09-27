package com.rajdeep.greatquotesbygreatpersonalities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class ReadActivity extends AppCompatActivity {
    TextView textViewInfo;
    ImageView imageViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        textViewInfo = findViewById(R.id.textViewInfo);
        imageViewInfo = findViewById(R.id.imageViewInfo);

        Intent i = getIntent();

        int flag = i.getIntExtra("flag", 0);

//        System.out.println("FLAG : " + flag);



        if(flag==1){

            String text = "<b>Albert Einstein</b> was a German-born theoretical physicist who is best known for his theory of relativity and his equation E=mc², which explains the relationship between energy and mass. Here's a brief overview of Albert Einstein in 10 lines:<br><br>" + "--------------------------------------<br><br>" +
                    "<b>1.</b> Albert Einstein was born on March 14, 1879, in Ulm, in the Kingdom of Württemberg in the German Empire.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>2.</b> He made significant contributions to the field of physics, particularly in the areas of theoretical physics and the study of light.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>3.</b> Einstein developed the theory of relativity, including the special theory of relativity published in 1905 and the general theory of relativity published in 1915.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>4.</b> His theory of relativity revolutionized our understanding of space, time, and gravity, challenging Isaac Newton's classical physics.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>5.</b> Einstein's famous equation E=mc² demonstrates the equivalence of energy (E) and mass (m) and highlights the immense energy contained within even small amounts of mass.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>6.</b> He was awarded the Nobel Prize in Physics in 1921 for his explanation of the photoelectric effect, which demonstrated the particle-like nature of light.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>7.</b> Einstein's work on the theory of Brownian motion provided evidence for the existence of atoms, supporting the atomic theory.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>8.</b> He was a pacifist and outspoken advocate for civil rights, using his platform and influence to promote peace and fight against racism and discrimination.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>9.</b> Einstein's intellect and creativity extended beyond physics, as he also made contributions to philosophy, mathematics, and humanitarian efforts.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>10.</b> Albert Einstein passed away on April 18, 1955, leaving a lasting legacy as one of the greatest scientific minds in history.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("ab", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }

        else if (flag == 2) {

            String text = "<b>A. P. J. Abdul Kalam</b>, full name Avul Pakir Jainulabdeen Abdul Kalam, was an Indian scientist and statesman who served as the 11th President of India from 2002 to 2007. Here's a brief overview of A. P. J. Abdul Kalam in 10 lines:<br><br>" + "--------------------------------------<br><br>" +
                    "<b>1.</b> A. P. J. Abdul Kalam was born on October 15, 1931, in Rameswaram, Tamil Nadu, India.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>2.</b> He had a humble background and overcame several hardships to become one of India's most respected scientists.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>3.</b> Kalam played a key role in the development of India's space and missile programs.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>4.</b> He served as the Chief Scientific Adviser to the Prime Minister of India and the Secretary of the Defence Research and Development Organisation (DRDO).<br>" + "--------------------------------------<br><br>" +
                    "<b>5.</b> Kalam was popularly known as the \"Missile Man of India\" for his contributions to India's missile technology, including the development of the Agni and Prithvi missiles.<br>" +  "--------------------------------------<br><br>" +
                    "<b>6.</b> He played a pivotal role in the successful nuclear tests conducted by India in 1998.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>7.</b> Kalam received numerous awards and honors, including the Bharat Ratna, India's highest civilian award, in 1997.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>8.</b> Apart from his scientific achievements, Kalam was an inspiring educator and writer, particularly known for his books aimed at motivating and empowering the youth.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>9.</b> He served as the President of India from 2002 to 2007, during which he focused on promoting education, science, and national development.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>10.</b> A. P. J. Abdul Kalam passed away on July 27, 2015, but his vision, dedication, and inspirational leadership continue to inspire millions of people in India and around the world.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("apj3", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }

        else if(flag==3){
            String text = "<b>Steve Jobs</b> was an American business magnate, industrial designer, and inventor. He co-founded Apple Inc., a technology company known for its revolutionary products. Here's a brief overview of Steve Jobs in 10 lines:<br><br>" + "--------------------------------------<br><br>" +
                    "<b>1.</b> Steve Jobs was born on February 24, 1955, in San Francisco, California.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>2.</b> In 1976, he co-founded Apple Inc. with Steve Wozniak in his parents' garage.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>3.</b> Jobs played a significant role in the development of iconic products like the Macintosh, iPhone, and iPad.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>4.</b> He was known for his visionary leadership and attention to detail, driving Apple's success.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>5.</b> Jobs was ousted from Apple in 1985 but returned to the company in 1997 and steered its revival.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>6.</b> His keynote presentations became legendary, showcasing new Apple products and captivating audiences.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>7.</b> Jobs also co-founded Pixar Animation Studios, which produced successful films like Toy Story and Finding Nemo.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>8.</b> He was known for his relentless pursuit of excellence and perfection, often described as a demanding and charismatic leader.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>9.</b> Steve Jobs passed away on October 5, 2011, leaving a profound impact on the technology industry.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>10.</b> His innovative thinking and design philosophy continue to inspire generations and shape the way we interact with technology today.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("steve_j", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag==4){
            String text = "<b>Henry Ford</b> was an American industrialist and business magnate who is best known for revolutionizing the automobile industry with the introduction of the assembly line and the mass production of affordable automobiles. Here's a brief overview of Henry Ford in 10 lines:<br><br>" +  "--------------------------------------<br><br>" +
                    "<b>1.</b> Henry Ford was born on July 30, 1863, in Greenfield Township, Michigan, United States.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>2.</b> He founded the Ford Motor Company in 1903 and played a major role in the development of the American automotive industry.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>3.</b> Ford's introduction of the Model T automobile in 1908 revolutionized transportation and made cars accessible to the middle class.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>4.</b> He implemented the concept of the assembly line, which significantly increased production efficiency and reduced costs.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>5.</b> Ford's innovative manufacturing techniques allowed for the mass production of automobiles, making them more affordable for the general public.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>6.</b> He also implemented the concept of \"Fordism,\" which emphasized standardized mass production, high wages for workers, and low prices for consumers.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>7.</b> Ford was a visionary leader and a staunch advocate of technological progress and innovation.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>8.</b> He introduced several significant advancements in the automotive industry, including the development of the moving assembly line and interchangeable parts.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>9.</b> Ford's success and influence extended beyond the automotive industry, as he also had a significant impact on American culture and society.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>10.</b> Henry Ford passed away on April 7, 1947, leaving behind a lasting legacy as one of the most influential figures in industrial history and a pioneer of modern manufacturing practices.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("ford_baba", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);

        }

        else if(flag==5){
            String text = "<b>Gautam Buddha</b>, also known as Siddhartha Gautama, was a spiritual leader and the founder of Buddhism. He is considered one of the most significant figures in human history and a source of inspiration for millions of people around the world. Here's a brief overview of Gautam Buddha in 10 lines:<br><br>" +  "--------------------------------------<br><br>" +
                    "<b>1.</b> Gautam Buddha was born in Lumbini, present-day Nepal, in the 5th century BCE.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>2.</b> He was born into a royal family as Prince Siddhartha Gautama.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>3.</b> Despite being raised in luxury, Siddhartha became disillusioned with worldly pleasures and embarked on a spiritual quest to seek enlightenment.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>4.</b> At the age of 29, Siddhartha renounced his privileged life, leaving his palace and family behind.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>5.</b> He spent several years practicing intense meditation and asceticism in search of the truth and the end of suffering.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>6.</b> After attaining enlightenment under the Bodhi Tree in Bodh Gaya, Siddhartha became known as Gautam Buddha, the \"Awakened One.\"<br><br>" + "--------------------------------------<br><br>" +
                    "<b>7.</b> Gautam Buddha preached the Four Noble Truths, which address the nature of suffering and the path to liberation from suffering.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>8.</b> He emphasized the practice of mindfulness, meditation, and ethical conduct as essential components of the path to enlightenment.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>9.</b> Buddha's teachings, known as the Dharma, formed the foundation of Buddhism, a major world religion.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>10.</b> Gautam Buddha's teachings continue to inspire people to cultivate compassion, wisdom, and inner peace, and his legacy has had a profound impact on philosophy, spirituality, and the pursuit of enlightenment.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("g_b", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);

        }
        else if (flag == 6) {
            String text = "<b>The Dalai Lama</b> is a spiritual leader who is regarded as the highest-ranking figure in Tibetan Buddhism. Here's a brief overview of the Dalai Lama in 10 lines:<br><br>" + "--------------------------------------<br><br>" +
                    "<b>1.</b> The Dalai Lama is a title given to the spiritual leaders of the Tibetan people.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>2.</b> The current Dalai Lama is Tenzin Gyatso, who was born on July 6, 1935, in Tibet.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>3.</b> At the age of 2, Tenzin Gyatso was recognized as the 14th Dalai Lama, the reincarnation of his predecessor.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>4.</b> As the Dalai Lama, Tenzin Gyatso became a prominent advocate for the rights and freedom of the Tibetan people.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>5.</b> He has worked tirelessly to promote non-violence, compassion, and dialogue as means to resolve conflicts.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>6.</b> In 1959, the Dalai Lama fled Tibet following a failed uprising against Chinese rule and sought refuge in India, where he established the Tibetan government-in-exile.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>7.</b> Throughout his life, the Dalai Lama has been a strong advocate for human rights, environmental conservation, and interfaith dialogue.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>8.</b> He has written numerous books on Buddhism, spirituality, and peace, which have been widely read and appreciated globally.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>9.</b> The Dalai Lama has received numerous awards and honors for his efforts in promoting peace, including the Nobel Peace Prize in 1989.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>10.</b> He continues to travel the world, giving teachings, lectures, and engaging in dialogues with various leaders and individuals, spreading his message of peace, compassion, and inner happiness.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("dalai_final", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);

        }
        else if(flag == 7){
            String text = "<b>Bruce Lee</b> (1940-1973) was a martial artist, actor, and filmmaker who is considered one of the most influential figures in the history of martial arts and action cinema. Here's a brief overview of Bruce Lee in 10 lines:<br><br>" + "--------------------------------------<br><br>" +
                    "<b>1.</b> Bruce Lee was born on November 27, 1940, in San Francisco, California, but he spent his early years in Hong Kong.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>2.</b> He began his martial arts training at a young age, studying Wing Chun and later developing his own martial art philosophy called Jeet Kune Do.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>3.</b> Bruce Lee gained fame through his role as Kato in the TV series \"The Green Hornet\" in the 1960s.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>4.</b> He became known for his physical prowess, agility, and innovative fighting techniques, blending elements of different martial arts styles.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>5.</b> Bruce Lee's first major film role was in \"The Big Boss\" (1971), followed by other iconic films such as \"Fist of Fury\" (1972) and \"Enter the Dragon\" (1973).<br><br>" + "--------------------------------------<br><br>" +
                    "<b>6.</b> He broke barriers as an Asian actor in Hollywood and popularized martial arts films in the Western world.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>7.</b> Bruce Lee was not only a skilled martial artist but also a philosopher, emphasizing personal growth, self-expression, and the importance of adaptability in martial arts and life.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>8.</b> He wrote books, including \"Tao of Jeet Kune Do,\" which captured his philosophies and teachings.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>9.</b> Tragically, Bruce Lee passed away on July 20, 1973, at the age of 32, due to an allergic reaction to medication.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>10.</b> Despite his short life, Bruce Lee's legacy continues to inspire martial artists and film enthusiasts worldwide, and he is remembered as an icon of martial arts cinema and a symbol of discipline, dedication, and innovation.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("bruce_lee_", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);

        }

        else if(flag == 8){
            String text = "<b>Martin Luther King Jr.</b> was a prominent leader in the American civil rights movement, known for his advocacy of nonviolent protest and his fight against racial segregation. His legacy continues to inspire generations in the pursuit of equality and social justice. Here's a brief overview of Martin Luther King Jr. in 10 lines:<br><br>" + "--------------------------------------<br><br>" +
                    "<b>1.</b> Martin Luther King Jr. was a prominent leader in the American civil rights movement.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>2.</b> He was born on January 15, 1929, in Atlanta, Georgia.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>3.</b> King advocated for equal rights and justice for African Americans, aiming to end racial segregation and discrimination.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>4.</b> He played a crucial role in organizing and leading peaceful protests, marches, and boycotts to challenge unjust laws and policies.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>5.</b> King's most famous speech, \"I Have a Dream,\" was delivered during the historic March on Washington in 1963, where he called for racial harmony and equality.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>6.</b> He was a proponent of nonviolent resistance, drawing inspiration from Mahatma Gandhi's philosophy of peaceful protest.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>7.</b> King's leadership and activism were instrumental in the Montgomery Bus Boycott, a successful campaign against racial segregation on public buses.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>8.</b> He co-founded the Southern Christian Leadership Conference (SCLC), an organization dedicated to promoting civil rights through nonviolent means.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>9.</b> King's efforts contributed to the passage of significant civil rights legislation, including the Civil Rights Act of 1964 and the Voting Rights Act of 1965.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>10.</b> Tragically, Martin Luther King Jr. was assassinated on April 4, 1968, in Memphis, Tennessee, leaving a lasting impact on the fight for racial equality and justice in the United States.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("m_k2", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }

        else if(flag ==9){
            String text = "<b>Thomas Edison</b> was an American inventor and businessman who made significant contributions to the fields of electricity, communication, and motion pictures. Here's a brief overview of Thomas Edison in 10 lines:<br><br>" + "--------------------------------------<br><br>" +
                    "<b>1.</b> Thomas Edison was born on February 11, 1847, in Milan, Ohio, United States.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>2.</b> He is best known for inventing the practical electric light bulb, which revolutionized the way we illuminate our world.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>3.</b> Edison held over 1,000 patents for various inventions, including the phonograph, motion picture camera, and the alkaline storage battery.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>4.</b> His research and innovations greatly impacted the development of industries such as power generation, telecommunications, and entertainment.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>5.</b> Edison established the world's first industrial research laboratory in Menlo Park, New Jersey, where he conducted groundbreaking experiments and developed new technologies.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>6.</b> He was a prolific inventor and had a relentless work ethic, famously stating, \"Genius is one percent inspiration, ninety-nine percent perspiration.\"<br><br>" + "--------------------------------------<br><br>" +
                    "<b>7.</b> Edison's inventions and entrepreneurial endeavors helped shape the modern world and laid the foundation for many technological advancements we enjoy today.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>8.</b> His contributions to the field of electricity led to the establishment of the Edison Electric Light Company, which eventually evolved into General Electric (GE).<br><br>" + "--------------------------------------<br><br>" +
                    "<b>9.</b> Edison's work and legacy continue to inspire inventors, scientists, and entrepreneurs around the world.<br><br>" + "--------------------------------------<br><br>" +
                    "<b>10.</b> He passed away on October 18, 1931, leaving behind a lasting impact on the fields of science, technology, and innovation.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("thomas_e", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }

        else if(flag == 10){
            String text = "<b>Bill Gates</b> is an American business magnate, philanthropist, and software developer who co-founded Microsoft Corporation, one of the world's largest technology companies. Here's a brief overview of Bill Gates in 10 lines:<br><br>" + "--------------------------------------<br><br>" +
                "<b>1.</b> Bill Gates was born on October 28, 1955, in Seattle, Washington, United States.<br><br>" + "--------------------------------------<br><br>" +
                "<b>2.</b> He co-founded Microsoft in 1975 with his childhood friend Paul Allen, and together they developed and popularized the personal computer.<br><br>" + "--------------------------------------<br><br>" +
                "<b>3.</b> Under Gates' leadership, Microsoft became a dominant player in the software industry, with its operating system, Windows, being widely used around the world.<br><br>" + "--------------------------------------<br><br>" +
                "<b>4.</b> Gates is known for his entrepreneurial spirit and vision, as he played a key role in shaping the modern computer industry.<br><br>" + "--------------------------------------<br><br>" +
                "<b>5.</b> He is one of the wealthiest individuals globally, consistently ranking among the world's richest people.<br><br>" + "--------------------------------------<br><br>" +
                "<b>6.</b> In 2000, Gates and his wife, Melinda Gates, established the Bill & Melinda Gates Foundation, one of the largest charitable organizations globally, focusing on education, healthcare, and poverty alleviation.<br><br>" + "--------------------------------------<br><br>" +
                "<b>7.</b> Through the foundation, Gates has been actively involved in philanthropy, tackling global challenges such as infectious diseases and improving access to education and technology.<br><br>" + "--------------------------------------<br><br>" +
                "<b>8.</b> Gates stepped down as Microsoft's CEO in 2000 but remained involved with the company as an advisor and board member until 2020.<br><br>" + "--------------------------------------<br><br>" +
                "<b>9.</b> He is also a renowned author, having written books on business, technology, and philanthropy.<br><br>" + "--------------------------------------<br><br>" +
                "<b>10.</b> Gates' contributions to the technology industry, business world, and philanthropy have made a significant impact, earning him widespread recognition and influence.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("b_g", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 11){
            String text = "<b>Abraham Lincoln</b> was the 16th President of the United States, serving from March 1861 until his assassination in April 1865. He is best known for leading the country during the American Civil War and working to end slavery. Here's a brief overview of Abraham Lincoln in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Abraham Lincoln was born on February 12, 1809, in a log cabin in Hardin County (now LaRue County), Kentucky, United States.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He grew up in a poor family on the frontier and was mostly self-educated, eventually becoming a lawyer in Illinois.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Lincoln served as a member of the Illinois State Legislature and the U.S. House of Representatives before being elected as the 16th President of the United States in 1860.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> As President, he led the nation through the Civil War, preserving the Union and strengthening the federal government.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Lincoln issued the Emancipation Proclamation in 1863, which declared all slaves in Confederate-held territory to be free.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He delivered the Gettysburg Address in 1863, a famous speech that emphasized the principles of human equality and national unity.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Lincoln was re-elected in 1864 and focused on rebuilding the nation and promoting healing and reconciliation between the North and South.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> On April 14, 1865, Lincoln was assassinated by John Wilkes Booth while attending a play at Ford's Theatre in Washington, D.C.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> His leadership and vision have made him one of the most revered figures in American history, often ranked among the greatest U.S. presidents.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Lincoln's legacy includes the preservation of the United States as a single nation and the abolition of slavery, setting a course for future civil rights advancements.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img11a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 12){
            String text = "<b>Alan Watts</b> was a British philosopher, writer, and speaker known for his interpretation and popularization of Eastern philosophy for a Western audience. Here's a brief overview of Alan Watts in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Alan Watts was born on January 6, 1915, in Chislehurst, England.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He moved to the United States in 1938, where he pursued studies in theology and Eastern philosophies.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Watts became an Episcopal priest in 1945 but left the ministry in 1950 to focus on writing and teaching.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He authored more than 25 books on subjects such as Zen Buddhism, Taoism, and comparative philosophy.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> His book \"The Way of Zen\" (1957) is one of his most famous works and helped introduce Zen Buddhism to Western readers.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> Watts was known for his engaging and accessible lecture style, which gained him a large following through public talks and radio broadcasts.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> He explored the nature of consciousness, the self, and the interconnectedness of all life in his teachings.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> Watts spent much of his later life in the San Francisco Bay Area, where he continued to write, teach, and lecture.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> He passed away on November 16, 1973, in Druid Heights, California, leaving behind a significant legacy in the study of Eastern philosophy.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Alan Watts' work continues to inspire and influence contemporary thought on spirituality and philosophy, bridging the gap between Eastern and Western perspectives.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img12a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 13){
            String text = "<b>Aesop</b> was an ancient Greek fabulist and storyteller credited with a collection of fables known for their moral lessons. Here's a brief overview of Aesop in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Aesop is believed to have lived around 620-564 BCE, though the exact dates of his life are uncertain.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He was reputedly a slave who gained freedom through his cleverness and storytelling abilities.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Aesop's fables, such as \"The Tortoise and the Hare\" and \"The Fox and the Grapes,\" are among the most famous in world literature.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> His stories often feature animals with human characteristics and deliver clear moral lessons.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Aesop's fables have been translated into numerous languages and are still taught to children around the world.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> There is much debate about whether Aesop was a real historical figure or a fictional character.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Ancient Greek historians, such as Herodotus, mention Aesop in their works.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> His fables have influenced many other literary traditions, including Western and Eastern literature.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Aesop's life and works continue to be subjects of scholarly study and popular adaptation.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> The themes of Aesop's fables, such as cunning, wisdom, and justice, remain relevant to contemporary audiences.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img13a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 14){
            String text = "<b>Albert Camus</b> was a French-Algerian philosopher, author, and journalist known for his contributions to existentialism and absurdism. Here's a brief overview of Albert Camus in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Albert Camus was born on November 7, 1913, in Mondovi, French Algeria.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He studied philosophy at the University of Algiers but had to leave due to tuberculosis.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Camus is best known for his novels \"The Stranger\" (1942) and \"The Plague\" (1947).<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> His philosophical essay \"The Myth of Sisyphus\" (1942) introduces his concept of the absurd.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Camus won the Nobel Prize in Literature in 1957 at the age of 44, the second-youngest recipient at the time.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He was involved in the French Resistance during World War II, editing an underground newspaper, \"Combat.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Camus' work often explored themes of existentialism, freedom, and rebellion against meaninglessness.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He also wrote plays and essays, including \"The Rebel\" (1951), which critiques revolutionary movements.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Camus died in a car accident on January 4, 1960, at the age of 46.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His ideas and literary works continue to influence modern thought and literature.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img14a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 15){
            String text = "<b>Benjamin Franklin</b> was an American polymath, one of the Founding Fathers of the United States, and a leading figure in the American Enlightenment. Here's a brief overview of Benjamin Franklin in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Benjamin Franklin was born on January 17, 1706, in Boston, Massachusetts Bay Colony.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He was a successful printer, author, and publisher, best known for \"Poor Richard's Almanack.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Franklin was a renowned scientist and inventor, known for his experiments with electricity and inventions such as the lightning rod and bifocal glasses.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He played a crucial role in the American Revolution, serving as a diplomat to France and securing French support for the American cause.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Franklin was a delegate to the Second Continental Congress and a signatory of the Declaration of Independence.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He helped draft the United States Constitution and was a delegate to the Constitutional Convention in 1787.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Franklin founded several civic organizations, including the University of Pennsylvania and the first public lending library in America.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He was an advocate for education, civic improvement, and public health, contributing to the establishment of institutions and infrastructure in Philadelphia.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Franklin's diplomatic efforts were key in securing the Treaty of Paris, which ended the American Revolutionary War.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> He died on April 17, 1790, in Philadelphia, leaving a legacy as a statesman, inventor, and advocate for liberty and enlightenment.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img15a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 16){
            String text = "<b>Barack Obama</b> is an American politician and attorney who served as the 44th President of the United States from 2009 to 2017. Here's a brief overview of Barack Obama in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Barack Obama was born on August 4, 1961, in Honolulu, Hawaii, United States.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He graduated from Columbia University and Harvard Law School, where he was the first African American president of the Harvard Law Review.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Obama served as a community organizer, civil rights attorney, and taught constitutional law at the University of Chicago Law School.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He served as an Illinois State Senator from 1997 to 2004 and then as a U.S. Senator from Illinois from 2005 to 2008.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Obama was elected as the 44th President of the United States in 2008, making history as the first African American president.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> His presidency saw the passage of significant legislation, including the Affordable Care Act (Obamacare) and the Dodd-Frank Wall Street Reform and Consumer Protection Act.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Obama was awarded the Nobel Peace Prize in 2009 for his efforts to strengthen international diplomacy and cooperation.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> His administration focused on recovering from the Great Recession, promoting clean energy, and advancing social issues such as LGBTQ rights.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> After leaving office, Obama has remained active in public life, focusing on issues such as democracy, global health, and education through the Obama Foundation.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Obama is also a bestselling author, with books such as \"Dreams from My Father\" and \"The Audacity of Hope,\" and his post-presidential memoir \"A Promised Land.\"";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img16a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 17){
            String text = "<b>Charlie Chaplin</b> was a British comic actor, filmmaker, and composer who rose to fame during the silent film era. Here's a brief overview of Charlie Chaplin in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Charlie Chaplin was born on April 16, 1889, in London, England.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He began his acting career as a child performer in music halls before moving to the United States in 1910.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Chaplin is best known for his character \"The Tramp,\" a comedic and sympathetic figure.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> His films, such as \"The Kid\" (1921), \"City Lights\" (1931), and \"Modern Times\" (1936), are considered classics of silent cinema.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Chaplin was a pioneer in film, directing, producing, writing, and starring in his own movies.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He co-founded United Artists in 1919, giving him complete control over his films.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Chaplin faced political controversy and was accused of communist sympathies during the McCarthy era.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He left the United States in 1952 and settled in Switzerland, where he continued to make films.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Chaplin received an honorary Academy Award in 1972 for his contributions to the film industry.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> He passed away on December 25, 1977, leaving a legacy as one of the most influential figures in film history.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img17a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 18){
            String text = "<b>Christopher Dawson</b> was a British historian, known for his works on cultural and religious history. Here's a brief overview of Christopher Dawson in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Christopher Dawson was born on October 12, 1889, in Hay Castle, Wales.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He studied at Winchester College and Trinity College, Oxford, where he developed a deep interest in history and religion.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Dawson's first major work, \"The Age of the Gods\" (1928), explored the development of human cultures and religions.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He believed that religion is the core of culture and emphasized the importance of Christian culture in Western civilization.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Dawson's works, such as \"Religion and the Rise of Western Culture\" (1950), are considered seminal in the study of cultural history.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He was a critic of secularism and modernity, arguing that the loss of religious faith leads to cultural decline.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Dawson taught at several institutions, including Harvard University, where he influenced many students with his interdisciplinary approach.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He was appointed to the Chair of Roman Catholic Studies at Harvard, a position created specifically for him.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Dawson's later works focused on the unity of Christian culture and the challenges it faced in the modern world.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> He passed away on May 25, 1970, leaving a legacy as one of the most influential historians of religion and culture in the 20th century.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img18a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 19){
            String text = "<b>Charles Dickens</b> was an English writer and social critic, widely regarded as one of the greatest novelists of the Victorian era. Here's a brief overview of Charles Dickens in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Charles Dickens was born on February 7, 1812, in Portsmouth, England.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He worked as a law clerk and a journalist before becoming a successful novelist.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Dickens' first novel, \"The Pickwick Papers\" (1836), brought him immediate fame.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> His notable works include \"Oliver Twist\" (1837), \"David Copperfield\" (1850), and \"Great Expectations\" (1861).<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Dickens' novels often explored social issues such as poverty, child labor, and class inequality.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He created some of literature's most memorable characters, including Ebenezer Scrooge and Pip.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Dickens was also an avid performer, giving public readings of his works to large audiences.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He founded and edited several magazines, including \"Household Words\" and \"All the Year Round.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Dickens' writing had a profound impact on social reform and the literary world.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> He died on June 9, 1870, leaving an enduring legacy as one of the greatest storytellers in English literature.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img19a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 20){
            String text = "<b>Anthony Robbins</b>, known as Tony Robbins, is an American author, entrepreneur, philanthropist, and life coach. Here's a brief overview of Tony Robbins in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Tony Robbins was born on February 29, 1960, in North Hollywood, California, United States.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He began his career promoting seminars for motivational speaker Jim Rohn.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Robbins gained fame with his self-help books \"Unlimited Power\" (1986) and \"Awaken the Giant Within\" (1991).<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He is known for his high-energy seminars, such as \"Unleash the Power Within\" and \"Date with Destiny.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Robbins has coached numerous celebrities, business leaders, and politicians.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He founded several companies involved in various industries, including media production and business services.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Robbins is a philanthropist, supporting initiatives in health, education, and fighting hunger.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> His documentary \"Tony Robbins: I Am Not Your Guru\" (2016) provides an inside look at his seminars.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> He continues to be a prominent figure in personal development and motivational speaking.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Robbins' work has inspired millions of people worldwide to improve their lives and achieve their goals.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img20a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 21){
            String text = "<b>Alexander the Great</b> was a Macedonian king and one of history's greatest military commanders. Here's a brief overview of Alexander the Great in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Alexander the Great was born on July 20, 356 BCE, in Pella, the ancient capital of Macedonia.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He was tutored by the philosopher Aristotle until the age of 16.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Alexander became king of Macedonia in 336 BCE after the assassination of his father, King Philip II.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He is known for creating one of the largest empires in history, stretching from Greece to Egypt and into northwest India.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Alexander's military tactics and strategies are still studied in military academies around the world.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He founded over 20 cities, the most famous being Alexandria in Egypt.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Alexander's empire helped spread Greek culture, language, and ideas throughout the known world, a period known as the Hellenistic Era.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> Despite his early death at the age of 32, his legacy influenced subsequent cultures and empires.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Alexander died on June 10 or 11, 323 BCE, in the palace of Nebuchadnezzar II in Babylon.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His life and conquests have been the subject of numerous historical and literary works, cementing his status as a legendary figure.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img21a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 22){
            String text = "<b>Christopher Hitchens</b> was an Anglo-American author, columnist, essayist, orator, and critic. Here's a brief overview of Christopher Hitchens in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Christopher Hitchens was born on April 13, 1949, in Portsmouth, England.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He studied at Balliol College, Oxford, where he developed his passion for writing and politics.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Hitchens wrote for numerous publications, including \"The Nation,\" \"Vanity Fair,\" and \"The Atlantic.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He was known for his outspoken views on religion, politics, and culture.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Hitchens' book \"God Is Not Great\" (2007) was a bestseller and a key text in the New Atheist movement.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He was a prolific author, with works including \"Letters to a Young Contrarian\" and \"Hitch-22: A Memoir.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Hitchens was known for his public debates, often engaging with religious figures and political opponents.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He became a U.S. citizen in 2007, continuing his career as a writer and commentator.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Hitchens was diagnosed with esophageal cancer in 2010 and continued to write and speak publicly until his death.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> He passed away on December 15, 2011, leaving a legacy as one of the most influential public intellectuals of his time.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img22a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 23){
            String text = "<b>Charles Darwin</b> was an English naturalist, geologist, and biologist, best known for his contributions to the science of evolution. Here's a brief overview of Charles Darwin in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Charles Darwin was born on February 12, 1809, in Shrewsbury, England.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He studied medicine at the University of Edinburgh and theology at the University of Cambridge.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Darwin embarked on a five-year voyage on HMS Beagle in 1831, during which he made significant observations on natural history.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> His observations of species on the Galápagos Islands were crucial in developing his theory of natural selection.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Darwin published \"On the Origin of Species\" in 1859, presenting evidence for evolution by natural selection.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> His work revolutionized biology, providing a unifying theory for the diversity of life.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Darwin's later works, including \"The Descent of Man,\" expanded on his evolutionary theories.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He faced significant opposition from religious and scientific communities but gradually gained acceptance.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Darwin's ideas have had a profound impact on various scientific disciplines, including genetics, ecology, and paleontology.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> He died on April 19, 1882, and is buried in Westminster Abbey, London, honored for his contributions to science.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img23a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 24){
            String text = "<b>Bernard Baruch</b> was an American financier, stock investor, philanthropist, statesman, and political consultant. Here's a brief overview of Bernard Baruch in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Bernard Baruch was born on August 19, 1870, in Camden, South Carolina, United States.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He made his fortune on Wall Street, becoming a millionaire by the age of 30.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Baruch became a prominent financier and investor, known for his insights into the stock market.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> During World War I, he served as chairman of the War Industries Board, coordinating U.S. industrial production.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Baruch was a close advisor to several U.S. presidents, including Woodrow Wilson and Franklin D. Roosevelt.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He played a significant role in the post-World War II economic planning, advocating for international cooperation.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Baruch was a proponent of physical fitness and often held meetings while walking in Washington, D.C.'s Lafayette Park.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He was a philanthropist, donating to various causes and institutions, including his alma mater, City College of New York.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Baruch's legacy includes the Baruch Plan, a proposal for international control of atomic energy.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> He died on June 20, 1965, in New York City, leaving a lasting impact on American economic and political life.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img24a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 25){
            String text = "<b>Swami Vivekananda</b> was an Indian Hindu monk and a key figure in introducing Indian philosophies of Vedanta and Yoga to the Western world. Here's a brief overview of Swami Vivekananda in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Swami Vivekananda was born on January 12, 1863, in Kolkata, India, as Narendra Nath Datta.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He was a disciple of the Indian mystic Ramakrishna and played a crucial role in the revival of Hinduism in India.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Vivekananda founded the Ramakrishna Mission in 1897 to promote social service and education.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He gained international recognition after his speech at the Parliament of the World's Religions in Chicago in 1893.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> His teachings emphasized the unity of all religions and the importance of selfless service.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> Vivekananda's works include influential books such as \"Raja Yoga\" and \"Karma Yoga.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> He was a strong advocate for the upliftment of the poor and stressed the need for national unity.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> Vivekananda traveled extensively, spreading the message of Vedanta and working to improve interfaith understanding.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> He passed away on July 4, 1902, at the age of 39, leaving a lasting legacy in both India and the world.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His birthday is celebrated as National Youth Day in India, honoring his contributions to philosophy and spirituality.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img25a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 26){
            String text = "<b>Deepak Chopra</b> is an Indian-American author, public speaker, and advocate for alternative medicine. Here's a brief overview of Deepak Chopra in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Deepak Chopra was born on October 22, 1946, in New Delhi, India.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He studied medicine in India and completed his residency in the United States.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Chopra became chief of staff at the New England Memorial Hospital before transitioning to alternative medicine.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He founded the Chopra Center for Wellbeing in California, focusing on mind-body healing practices.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Chopra is known for integrating Eastern philosophy with Western medical practices.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> His best-selling books, such as \"The Seven Spiritual Laws of Success\" and \"Quantum Healing,\" have influenced millions.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> He emphasizes the connection between physical health, mental well-being, and spirituality.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> Chopra's teachings have been both praised for their holistic approach and criticized for lacking scientific rigor.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> He continues to lecture, write, and advocate for a more integrative approach to health.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Chopra's work has made him one of the most recognizable figures in the field of alternative medicine.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img26a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 27){
            String text = "<b>Elon Musk</b> is an entrepreneur, inventor, and CEO known for his work in technology and space exploration. Here's a brief overview of Elon Musk in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Elon Musk was born on June 28, 1971, in Pretoria, South Africa.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He moved to the United States to study at the University of Pennsylvania, earning degrees in physics and economics.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Musk co-founded Zip2, an online city guide software company, which was sold to Compaq for nearly $300 million.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He then founded X.com, which later became PayPal, a major online payment system acquired by eBay for $1.5 billion.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> In 2002, Musk founded SpaceX with the goal of reducing space transportation costs and enabling Mars colonization.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He joined Tesla Motors in 2004, leading the company to become a leader in electric vehicles and renewable energy.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Musk's ventures also include SolarCity, Neuralink, The Boring Company, and OpenAI.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He is known for his ambitious vision, including plans for high-speed transportation with the Hyperloop and a Mars colony.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Musk has faced numerous challenges and controversies but remains a highly influential figure in technology and innovation.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His work continues to push the boundaries of technology, aiming to address global challenges and advance human civilization.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img27a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 28){
            String text = "<b>William Shakespeare</b> was an English playwright, poet, and actor, widely regarded as one of the greatest writers in the English language. Here's a brief overview of William Shakespeare in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> William Shakespeare was born on April 23, 1564, in Stratford-upon-Avon, England.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He married Anne Hathaway at the age of 18 and had three children.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Shakespeare moved to London, where he began his career as an actor and playwright.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He became a part-owner of the Lord Chamberlain's Men, later known as the King's Men, a leading theater company.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> His works include 39 plays, 154 sonnets, and two long narrative poems.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> Notable plays include \"Romeo and Juliet,\" \"Hamlet,\" \"Othello,\" \"Macbeth,\" and \"A Midsummer Night's Dream.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Shakespeare's writing explored themes such as love, power, jealousy, betrayal, and the supernatural.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> His work has been translated into every major living language and performed more often than any other playwright's.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Shakespeare retired to Stratford-upon-Avon around 1613, where he lived until his death on April 23, 1616.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His legacy endures through his contributions to literature, language, and the arts, making him an iconic figure in world culture.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img28a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 29){
            String text = "<b>Plato</b> was a classical Greek philosopher, student of Socrates, and teacher of Aristotle. Here's a brief overview of Plato in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Plato was born around 427 BCE in Athens, Greece.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He founded the Academy in Athens, one of the earliest institutions of higher learning in the Western world.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Plato's writings are in the form of dialogues, exploring various philosophical themes.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> His most famous works include \"The Republic,\" \"Phaedo,\" \"Symposium,\" and \"Timaeus.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Plato's philosophy covered topics such as justice, ethics, politics, and the nature of reality.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He introduced the Theory of Forms, positing that non-material abstract forms represent the most accurate reality.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Plato's allegory of the cave illustrates his views on human perception and enlightenment.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He was deeply influenced by his mentor, Socrates, and often featured him as a character in his dialogues.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Plato's Academy lasted for centuries, influencing many subsequent philosophers and scientists.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> He died around 347 BCE, but his ideas continue to be studied and revered in the field of philosophy.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img29a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 30){
            String text = "<b>Socrates</b> was a classical Greek philosopher credited as one of the founders of Western philosophy. Here's a brief overview of Socrates in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Socrates was born around 470 BCE in Athens, Greece.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He served as a soldier during the Peloponnesian War.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Socrates is best known for his contributions to ethics and epistemology.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He developed the Socratic method, a form of cooperative argumentative dialogue to stimulate critical thinking.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Socrates had no written works; his teachings are known through the accounts of his students, notably Plato.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He questioned the moral and philosophical beliefs of his fellow Athenians, often engaging in public debates.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Socrates was tried and sentenced to death in 399 BCE for allegedly corrupting the youth and impiety.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He accepted his death sentence and drank hemlock poison as an act of compliance with the law.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Socratic questioning remains a foundational teaching tool in philosophy and law.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His life and ideas have profoundly influenced Western philosophy and the intellectual tradition.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img30a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 31){
            String text = "<b>Swami Sivananda</b> was a renowned spiritual teacher, author, and proponent of Yoga and Vedanta. Here's a brief overview of Swami Sivananda in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Swami Sivananda was born on September 8, 1887, in Pattamadai, Tamil Nadu, India.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He initially pursued a career in medicine, working as a physician in Malaysia.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> After experiencing a spiritual awakening, he returned to India and renounced worldly life.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> In 1924, he founded the Divine Life Society in Rishikesh, a spiritual organization dedicated to the teachings of Yoga and Vedanta.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Swami Sivananda authored over 200 books on yoga, spirituality, and health.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> His teachings emphasized the synthesis of the four paths of Yoga: Karma Yoga, Bhakti Yoga, Raja Yoga, and Jnana Yoga.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> He was known for his simple and practical approach to spirituality, making it accessible to all.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> Swami Sivananda's famous disciples include Swami Chidananda, Swami Satchidananda, and Swami Vishnudevananda.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> He passed away on July 14, 1963, but his teachings continue to inspire millions around the world.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His legacy lives on through the Divine Life Society and numerous affiliated organizations dedicated to spreading his message of peace, health, and spiritual enlightenment.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img31a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 32){
            String text = "<b>Mark Twain</b> was an American author and humorist known for his classic novels. Here's a brief overview of Mark Twain in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Mark Twain was born Samuel Langhorne Clemens on November 30, 1835, in Florida, Missouri, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He is best known for his novels \"The Adventures of Tom Sawyer\" and \"Adventures of Huckleberry Finn.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Twain worked as a riverboat pilot on the Mississippi River before turning to writing.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> His sharp wit and keen observations made him a popular speaker and humorist.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Twain's works often addressed social issues, including slavery and racism.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He traveled extensively, giving lectures and gathering material for his writings.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Twain also wrote numerous short stories, essays, and non-fiction works.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> Despite his literary success, Twain faced financial difficulties and personal tragedies.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> He died on April 21, 1910, in Redding, Connecticut, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Mark Twain's legacy endures as one of America's greatest writers and humorists.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img32a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 33){
            String text = "<b>Mahatma Gandhi</b> was an Indian lawyer, anti-colonial nationalist, and political ethicist. Here's a brief overview of Mahatma Gandhi in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Mahatma Gandhi was born on October 2, 1869, in Porbandar, Gujarat, India.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> His full name was Mohandas Karamchand Gandhi.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Gandhi studied law in London and worked in South Africa, where he developed his philosophy of nonviolent resistance.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He returned to India and became a leader in the Indian independence movement.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Gandhi's campaigns of civil disobedience and non-cooperation significantly challenged British rule.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He promoted Swaraj (self-rule), nonviolence, and social reforms.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Gandhi led the famous Salt March in 1930 to protest the British salt tax.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He was imprisoned multiple times for his activism.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Gandhi was assassinated on January 30, 1948, in New Delhi, India.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His legacy continues to inspire movements for civil rights and freedom across the world.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img33a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 34){
            String text = "<b>Leonardo da Vinci</b> was an Italian polymath of the Renaissance era. Here's a brief overview of Leonardo da Vinci in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Leonardo da Vinci was born on April 15, 1452, in Vinci, Italy.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He is renowned for his contributions to art, science, and engineering.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Da Vinci's most famous paintings include \"Mona Lisa\" and \"The Last Supper.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He kept detailed notebooks filled with sketches, scientific diagrams, and ideas.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Da Vinci made significant discoveries in anatomy, geology, and hydraulics.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He conceptualized inventions such as flying machines and armored vehicles.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Da Vinci's work epitomizes the Renaissance humanist ideal.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He worked for various patrons, including the Duke of Milan and King Francis I of France.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Leonardo da Vinci died on May 2, 1519, in Amboise, France.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His legacy as a master artist and visionary thinker endures to this day.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img34a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 35){
            String text = "<b>Usain Bolt</b> is a Jamaican sprinter widely regarded as the fastest man in the world. Here's a brief overview of Usain Bolt in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Usain Bolt was born on August 21, 1986, in Sherwood Content, Jamaica.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He is an eight-time Olympic gold medalist and eleven-time World Champion.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Bolt holds the world records for the 100 meters (9.58 seconds) and 200 meters (19.19 seconds).<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He first gained global recognition at the 2008 Beijing Olympics.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Bolt's charismatic personality and signature 'Lightning Bolt' pose made him a global superstar.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He has won numerous awards, including the Laureus World Sportsman of the Year.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Bolt retired from competitive athletics in 2017.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He has pursued interests in football, music, and entrepreneurship post-retirement.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Bolt is involved in charity work through the Usain Bolt Foundation.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His legacy as one of the greatest sprinters in history remains unchallenged.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img35a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 36){
            String text = "<b>Helen Keller</b> was an American author, disability rights advocate, and lecturer. Here's a brief overview of Helen Keller in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Helen Keller was born on June 27, 1880, in Tuscumbia, Alabama, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> She lost her sight and hearing at 19 months due to an illness.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Keller's teacher, Anne Sullivan, taught her to communicate through touch.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> She became the first deaf-blind person to earn a Bachelor of Arts degree.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Keller authored 12 books, including her autobiography \"The Story of My Life.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> She was a prominent advocate for people with disabilities, women's rights, and social justice.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Keller was a co-founder of the American Civil Liberties Union (ACLU).<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> She traveled extensively, giving lectures and raising awareness about disability issues.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Helen Keller received numerous honors, including the Presidential Medal of Freedom.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> She died on June 1, 1968, in Easton, Connecticut, USA, leaving a legacy of inspiration and advocacy.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img36a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 37){
            String text = "<b>Karl Marx</b> was a German philosopher, economist, and revolutionary socialist. Here's a brief overview of Karl Marx in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Karl Marx was born on May 5, 1818, in Trier, Prussia (now Germany).<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He studied law and philosophy at the universities of Bonn and Berlin.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Marx's collaboration with Friedrich Engels led to the development of Marxist theory.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He co-authored \"The Communist Manifesto\" with Engels in 1848.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Marx's major work, \"Das Kapital,\" critiques political economy and capitalism.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> His theories on class struggle, historical materialism, and surplus value have had a profound impact on social sciences.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Marx spent much of his life in poverty and political exile, living primarily in London.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He was involved in various socialist and communist organizations.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Marx died on March 14, 1883, in London, England.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His ideas have influenced numerous political movements and remain relevant in contemporary discussions on society and economics.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img37a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 38){
            String text = "<b>Jesus Christ</b> is the central figure of Christianity, believed by Christians to be the Son of God and the savior of humanity. Here's a brief overview of Jesus Christ in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Jesus Christ was born around 4 BCE in Bethlehem, Judea (now in modern-day Israel/Palestine).<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He was a Jewish preacher and religious leader.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Jesus began his public ministry around the age of 30, teaching about love, forgiveness, and the Kingdom of God.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He performed miracles, healed the sick, and preached parables to the masses.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Jesus was baptized by John the Baptist in the River Jordan.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He gathered a group of disciples, with the twelve apostles being his closest followers.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Jesus was crucified around 30-33 CE under the order of Pontius Pilate, the Roman governor of Judea.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> Christians believe Jesus rose from the dead on the third day after his crucifixion, an event celebrated as Easter.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> His life and teachings are recorded in the New Testament of the Bible.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Jesus Christ's message of salvation and his role as the Messiah form the foundation of Christian faith.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img38a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 39){
            String text = "<b>George Washington</b> was the first President of the United States and a key figure in the American Revolutionary War. Here's a brief overview of George Washington in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> George Washington was born on February 22, 1732, in Westmoreland County, Virginia, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He served as the commander-in-chief of the Continental Army during the American Revolutionary War.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Washington played a crucial role in securing American independence from Britain.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He presided over the Constitutional Convention of 1787, which led to the drafting of the U.S. Constitution.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Washington was unanimously elected as the first President of the United States, serving from 1789 to 1797.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> His leadership established many protocols for the new government and the executive branch.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> He declined a third term and emphasized the importance of a peaceful transition of power.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> Washington is often referred to as the \"Father of His Country.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> He retired to his plantation at Mount Vernon, where he died on December 14, 1799.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> George Washington's legacy endures as a symbol of American leadership, integrity, and national unity.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img39a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 40){
            String text = "<b>Prophet Muhammad</b> is the founder of Islam and is regarded by Muslims as the last messenger of God. Here's a brief overview of Prophet Muhammad in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Prophet Muhammad was born around 570 CE in Mecca, in present-day Saudi Arabia.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He belonged to the Quraysh tribe and was raised by his grandfather and uncle.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Muhammad began receiving revelations from Allah (God) at the age of 40 through the angel Gabriel.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> These revelations were later compiled into the Quran, the holy book of Islam.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> He preached monotheism, social justice, and compassion for all.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> Muhammad faced persecution in Mecca and later migrated to Medina in 622 CE, an event known as the Hijra.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> In Medina, he established a Muslim community and became a political and spiritual leader.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> Muhammad's teachings and leadership led to the unification of the Arabian Peninsula under Islam.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> He passed away on June 8, 632 CE, in Medina, but his teachings continue to guide millions.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Muhammad is regarded as the final prophet in Islam, sealing the line of prophets that began with Adam.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img40a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 41){
            String text = "<b>Emily Dickinson</b> was an American poet known for her reclusive lifestyle and innovative poetry. Here's a brief overview of Emily Dickinson in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Emily Dickinson was born on December 10, 1830, in Amherst, Massachusetts, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> She wrote nearly 1,800 poems, though only a few were published during her lifetime.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Dickinson's poetry is noted for its unconventional use of form and syntax.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> Themes in her work include nature, death, immortality, and the inner self.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Dickinson lived much of her life in isolation, rarely leaving her family home.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> Her correspondence with friends and family reveals her sharp intellect and wit.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> After her death on May 15, 1886, her sister Lavinia discovered her extensive collection of poems.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> Dickinson's first volume of poetry was published posthumously in 1890.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> She is now considered one of the most important figures in American literature.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Emily Dickinson's work has had a lasting impact on poetry and continues to be widely studied and admired.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img41a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 42){
            String text = "<b>Fyodor Dostoevsky</b> was a Russian novelist, short story writer, essayist, and journalist. Here's a brief overview of Fyodor Dostoevsky in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Fyodor Dostoevsky was born on November 11, 1821, in Moscow, Russia.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He is best known for his novels \"Crime and Punishment,\" \"The Idiot,\" and \"The Brothers Karamazov.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Dostoevsky's works explore deep psychological and philosophical themes.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He was arrested in 1849 for his involvement with a radical group and was sentenced to a Siberian labor camp.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> This experience profoundly influenced his writing and worldview.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> Dostoevsky struggled with gambling addiction and financial difficulties throughout his life.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> He wrote some of his greatest works in the latter part of his career.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> Dostoevsky's exploration of the human condition has earned him a place among the greatest novelists of all time.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> He died on February 9, 1881, in St. Petersburg, Russia.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Fyodor Dostoevsky's influence extends beyond literature, impacting psychology, philosophy, and existentialism.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img42a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 43){
            String text = "<b>Jane Austen</b> was an English novelist known for her keen observations of social manners and relationships. Here's a brief overview of Jane Austen in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Jane Austen was born on December 16, 1775, in Steventon, Hampshire, England.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> She is best known for her novels \"Pride and Prejudice,\" \"Sense and Sensibility,\" and \"Emma.\"<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Austen's works are celebrated for their wit, social commentary, and exploration of women's lives in Georgian England.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> She published her novels anonymously, and her identity as an author was not widely known during her lifetime.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Austen's writing reflects her sharp observations of human nature and social dynamics.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> Her works often critique the limitations placed on women in her society.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Austen never married, and much of her life was spent living with her family.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> She died on July 18, 1817, in Winchester, Hampshire, England.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Austen's novels have been adapted into numerous films, television series, and stage productions.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Jane Austen's legacy endures, and she is considered one of the greatest novelists in English literature.";
            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img43a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 44){
            String text = "<b>Osho</b>, also known as Bhagwan Shree Rajneesh, was an Indian mystic, guru, and spiritual teacher. Here's a brief overview of Osho in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Osho was born Chandra Mohan Jain on December 11, 1931, in Kuchwada, India.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He was known for his teachings on meditation, love, and the human experience.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Osho's philosophy combined elements of Eastern and Western spiritual traditions.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He founded the Rajneesh movement, attracting thousands of followers worldwide.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> In the 1980s, Osho established a large commune in Oregon, USA, called Rajneeshpuram.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> His teachings emphasized the importance of personal transformation and inner freedom.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Osho was a prolific author, and many of his discourses were recorded and published.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> Controversy surrounded Osho and his movement, particularly regarding legal issues and the management of Rajneeshpuram.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> He died on January 19, 1990, in Pune, India, where his ashram continues to operate.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Osho's teachings continue to influence modern spirituality, meditation practices, and new age philosophies.";


            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img44a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 45){
            String text = "<b>Confucius</b>, also known as Kong Fuzi, was a Chinese philosopher and teacher. Here's a brief overview of Confucius in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Confucius was born on September 28, 551 BCE, in Qufu, China.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He is best known for his teachings on ethics, family loyalty, and respect for elders.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Confucius' philosophy emphasized personal and governmental morality.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> His teachings and philosophy have deeply influenced Chinese culture and society.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Confucius' ideas were compiled into the Analects, a collection of his sayings and ideas.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He believed in the importance of education and self-cultivation.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Confucius' teachings laid the foundation for the system of Confucianism.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> His thoughts were developed into a system known as Confucianism, which became a guiding philosophy for Chinese governance.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Confucius passed away on April 11, 479 BCE, in Qufu, China.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Confucius' teachings continue to influence Chinese and East Asian thought and values to this day.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img45a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 46){
            String text = "<b>Neil Armstrong</b>, was an American astronaut and the first person to walk on the moon. Here's a brief overview of Neil Armstrong in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Neil Armstrong was born on August 5, 1930, in Wapakoneta, Ohio, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He was an aerospace engineer, naval aviator, test pilot, and university professor.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Armstrong joined NASA in 1962 as part of the second group of astronauts.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He is best known for being the first human to set foot on the moon during the Apollo 11 mission on July 20, 1969.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> His famous words upon stepping onto the moon were, 'That's one small step for man, one giant leap for mankind.'<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> Before becoming an astronaut, Armstrong served as a naval aviator and flew combat missions during the Korean War.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> After leaving NASA, Armstrong taught aerospace engineering at the University of Cincinnati.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He received numerous awards and honors for his contributions to space exploration.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Neil Armstrong passed away on August 25, 2012, in Cincinnati, Ohio, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His legacy continues to inspire future generations of astronauts and space enthusiasts.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img46a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 47){
            String text = "<b>Sir Isaac Newton</b>, was an English mathematician, physicist, and astronomer. Here's a brief overview of Isaac Newton in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Isaac Newton was born on January 4, 1643, in Woolsthorpe, England.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He is best known for formulating the laws of motion and universal gravitation.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Newton's work laid the foundation for classical mechanics.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He made significant contributions to mathematics, including the development of calculus.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Newton also conducted pioneering work in optics, studying the nature of light and color.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> His book 'Philosophiæ Naturalis Principia Mathematica' is considered one of the most important works in the history of science.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Newton served as the President of the Royal Society and was knighted in 1705.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He held the position of Warden and Master of the Royal Mint.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Isaac Newton passed away on March 31, 1727, in London, England.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His discoveries and theories have had a profound impact on science and our understanding of the natural world.";


            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img47a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 48){
            String text = "<b>Tony Robbins</b>, is an American author, coach, and motivational speaker. Here's a brief overview of Tony Robbins in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Tony Robbins was born Anthony J. Mahavoric on February 29, 1960, in North Hollywood, California, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He is known for his seminars, self-help books, and infomercials.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Robbins' book 'Awaken the Giant Within' became a bestseller and established his reputation as a self-help guru.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He has worked with influential figures, including presidents, athletes, and business leaders.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Tony Robbins' seminars, such as 'Unleash the Power Within,' attract thousands of participants worldwide.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> His teachings focus on personal development, financial success, and achieving goals.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Robbins founded the Anthony Robbins Foundation to support various humanitarian causes.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He has been featured in numerous documentaries, including 'I Am Not Your Guru.'<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Robbins is a successful entrepreneur, with ventures in media production, hospitality, and finance.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His motivational techniques continue to inspire millions to improve their lives and achieve their dreams.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img48a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 49){
            String text = "<b>Vincent van Gogh</b>, was a Dutch post-impressionist painter. Here's a brief overview of Vincent van Gogh in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Vincent van Gogh was born on March 30, 1853, in Zundert, Netherlands.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He created over 2,000 artworks, including about 860 oil paintings.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Van Gogh's most famous works include 'Starry Night,' 'Sunflowers,' and 'The Bedroom.'<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> His style is characterized by bold colors, expressive brushwork, and emotional honesty.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Despite his talent, van Gogh struggled with mental illness and poverty throughout his life.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He only sold a few paintings during his lifetime and was largely unknown.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Van Gogh's work gained recognition and acclaim posthumously, influencing modern art.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He spent time in psychiatric hospitals, including a period at Saint-Rémy-de-Provence.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Vincent van Gogh died on July 29, 1890, in Auvers-sur-Oise, France, from a gunshot wound.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His legacy lives on, with his works being celebrated and displayed in museums worldwide.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img49a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 50){
            String text = "<b>Warren Buffett</b>, is an American business magnate, investor, and philanthropist. Here's a brief overview of Warren Buffett in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Warren Buffett was born on August 30, 1930, in Omaha, Nebraska, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He is the chairman and CEO of Berkshire Hathaway, a multinational conglomerate.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Buffett is considered one of the most successful investors of all time.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> Known as the 'Oracle of Omaha,' he has a long track record of profitable investments.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Buffett's investment philosophy focuses on value investing and long-term growth.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He has pledged to give away 99% of his wealth to philanthropic causes.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Buffett co-founded The Giving Pledge, encouraging billionaires to donate their wealth.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He is known for his frugal lifestyle, despite being one of the wealthiest individuals in the world.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Buffett's annual letters to Berkshire Hathaway shareholders are widely read and respected.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His investment strategies and principles continue to influence investors globally.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img50a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 51){
            String text = "<b>Chanakya</b>, also known as Kautilya or Vishnugupta, was an ancient Indian teacher, philosopher, and royal advisor. Here's a brief overview of Chanakya in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Chanakya was born in 375 BCE in Takshashila, ancient India.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He authored the ancient Indian political treatise 'Arthashastra.'<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Chanakya played a pivotal role in the establishment of the Maurya Empire.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He was the chief advisor to Emperor Chandragupta Maurya.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> His strategies and policies helped Chandragupta rise to power and build a strong empire.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> Chanakya's teachings focus on politics, economics, and military strategy.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> He is considered one of the earliest economists and political scientists in India.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> Chanakya's work 'Arthashastra' is still studied for its insights into governance and administration.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> He believed in the importance of realpolitik and pragmatic governance.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Chanakya's legacy continues to influence Indian political thought and strategy.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img51a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 52){
            String text = "<b>Denis Waitley</b>, is an American motivational speaker, writer, and consultant. Here's a brief overview of Denis Waitley in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Denis Waitley was born on February 21, 1933, in San Diego, California, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He is known for his work in the fields of self-help, motivation, and personal development.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Waitley's most famous book is 'The Psychology of Winning,' which has sold millions of copies.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He served as a consultant to NASA's Apollo program and various Fortune 500 companies.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Waitley has authored numerous books and audio programs on success and personal achievement.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> His teachings focus on self-esteem, positive thinking, and goal setting.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Waitley is a member of the International Speakers Hall of Fame.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He has received numerous awards for his contributions to the field of personal development.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Denis Waitley's seminars and workshops have inspired millions worldwide.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His work continues to influence individuals seeking success and fulfillment in their personal and professional lives.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img52a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 53){
            String text = "<b>Walt Disney</b>, was an American entrepreneur, animator, and film producer. Here's a brief overview of Walt Disney in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Walt Disney was born on December 5, 1901, in Chicago, Illinois, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He co-founded The Walt Disney Company, one of the largest entertainment companies in the world.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Disney created iconic characters such as Mickey Mouse and Donald Duck.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He pioneered the American animation industry, introducing synchronized sound in cartoons.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Disney produced the first full-length animated feature film, 'Snow White and the Seven Dwarfs,' in 1937.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He expanded his business into theme parks, opening Disneyland in 1955.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Disney won 22 Academy Awards and was nominated 59 times during his career.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> His work has had a lasting impact on popular culture and the entertainment industry.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Walt Disney passed away on December 15, 1966, in Burbank, California, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His legacy continues to thrive through the ongoing success of The Walt Disney Company and its various ventures.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img53a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 54){
            String text = "<b>Walt Whitman</b>, was an American poet, essayist, and journalist. Here's a brief overview of Walt Whitman in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Walt Whitman was born on May 31, 1819, in West Hills, New York, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He is often regarded as one of America's most influential poets.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Whitman's most famous work is 'Leaves of Grass,' a poetry collection first published in 1855.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> His poetry celebrated democracy, nature, love, and the human spirit.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Whitman worked as a journalist, teacher, and government clerk during his lifetime.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He served as a volunteer nurse during the American Civil War, which deeply influenced his writing.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Whitman's style was revolutionary for its free verse and expansive, conversational tone.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> He faced both praise and controversy for his candid and unconventional themes.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Walt Whitman passed away on March 26, 1892, in Camden, New Jersey, USA.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> His legacy endures, with his works continuing to inspire readers and writers worldwide.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img54a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
        else if(flag == 55){
            String text = "<b>Nikola Tesla</b>, was a Serbian-American inventor, electrical engineer, and futurist. Here's a brief overview of Nikola Tesla in 10 lines:<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>1.</b> Nikola Tesla was born on July 10, 1856, in Smiljan, Austrian Empire (modern-day Croatia).<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>2.</b> He is best known for his contributions to the development of alternating current (AC) electrical systems.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>3.</b> Tesla worked with Thomas Edison before branching out on his own to pursue his inventions.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>4.</b> He held over 300 patents for his various innovations and discoveries.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>5.</b> Tesla's inventions include the Tesla coil, wireless energy transmission, and radio waves.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>6.</b> He envisioned a world with free wireless energy and advanced technologies.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>7.</b> Tesla faced financial difficulties and was often overshadowed by other inventors of his time.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>8.</b> His contributions to electrical engineering have had a lasting impact on modern technology.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>9.</b> Tesla died on January 7, 1943, in New York City, USA, in relative obscurity.<br><br>" +
                    "--------------------------------------<br><br>" +
                    "<b>10.</b> Today, Tesla is celebrated as a visionary and his legacy lives on through various scientific advancements and pop culture references.";

            textViewInfo.setText(Html.fromHtml(text));
            int resourceId = getResources().getIdentifier("img55a", "drawable", getPackageName());
            imageViewInfo.setImageResource(resourceId);
        }
    }
}