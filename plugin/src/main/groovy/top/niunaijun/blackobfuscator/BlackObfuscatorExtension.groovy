package top.niunaijun.blackobfuscator
import org.gradle.api.Project

class BlackObfuscatorExtension {
    boolean enabled = false
    int depth = 1
    String[] obfClass = []

    BlackObfuscatorExtension(Project project) {

    }


    @Override
    public String toString() {
        return "BlackObfuscatorExtension{" +
                "enabled=" + enabled +
                ", depth=" + depth +
                ", obfClass=" + Arrays.toString(obfClass) +
                '}';
    }
}