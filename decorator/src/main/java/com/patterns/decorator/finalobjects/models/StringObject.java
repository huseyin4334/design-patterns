package com.patterns.decorator.finalobjects.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@AllArgsConstructor
public class StringObject {

    @Getter
    @Setter
    private String string;

    public int length() {
        return string.length();
    }

    public boolean isEmpty() {
        return string.isEmpty();
    }

    public char charAt(int index) {
        return string.charAt(index);
    }

    public int codePointAt(int index) {
        return string.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return string.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return string.codePointCount(beginIndex, endIndex);
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return string.offsetByCodePoints(index, codePointOffset);
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        string.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return string.getBytes(charsetName);
    }

    public byte[] getBytes(Charset charset) {
        return string.getBytes(charset);
    }

    public byte[] getBytes() {
        return string.getBytes();
    }

    public boolean contentEquals(StringBuffer sb) {
        return string.contentEquals(sb);
    }

    public boolean contentEquals(CharSequence cs) {
        return string.contentEquals(cs);
    }

    public boolean equalsIgnoreCase(String anotherString) {
        return string.equalsIgnoreCase(anotherString);
    }

    public int compareTo(String anotherString) {
        return string.compareTo(anotherString);
    }

    public int compareToIgnoreCase(String str) {
        return string.compareToIgnoreCase(str);
    }

    public boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return string.regionMatches(toffset, other, ooffset, len);
    }

    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return string.regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    public boolean startsWith(String prefix, int toffset) {
        return string.startsWith(prefix, toffset);
    }

    public boolean startsWith(String prefix) {
        return string.startsWith(prefix);
    }

    public boolean endsWith(String suffix) {
        return string.endsWith(suffix);
    }

    public int indexOf(int ch) {
        return string.indexOf(ch);
    }

    public int indexOf(int ch, int fromIndex) {
        return string.indexOf(ch, fromIndex);
    }

    public int lastIndexOf(int ch) {
        return string.lastIndexOf(ch);
    }

    public int lastIndexOf(int ch, int fromIndex) {
        return string.lastIndexOf(ch, fromIndex);
    }

    public int indexOf(String str) {
        return string.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return string.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return string.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return string.lastIndexOf(str, fromIndex);
    }

    public String substring(int beginIndex) {
        return string.substring(beginIndex);
    }

    public String substring(int beginIndex, int endIndex) {
        return string.substring(beginIndex, endIndex);
    }

    public CharSequence subSequence(int beginIndex, int endIndex) {
        return string.subSequence(beginIndex, endIndex);
    }

    public String concat(String str) {
        return string.concat(str);
    }

    public String replace(char oldChar, char newChar) {
        return string.replace(oldChar, newChar);
    }

    public boolean matches(String regex) {
        return string.matches(regex);
    }

    public boolean contains(CharSequence s) {
        return string.contains(s);
    }

    public String replaceFirst(String regex, String replacement) {
        return string.replaceFirst(regex, replacement);
    }

    public String replaceAll(String regex, String replacement) {
        return string.replaceAll(regex, replacement);
    }

    public String replace(CharSequence target, CharSequence replacement) {
        return string.replace(target, replacement);
    }

    public String[] split(String regex, int limit) {
        return string.split(regex, limit);
    }

    public String[] split(String regex) {
        return string.split(regex);
    }

    public String toLowerCase(Locale locale) {
        return string.toLowerCase(locale);
    }

    public String toLowerCase() {
        return string.toLowerCase();
    }

    public String toUpperCase(Locale locale) {
        return string.toUpperCase(locale);
    }

    public String toUpperCase() {
        return string.toUpperCase();
    }

    public String trim() {
        return string.trim();
    }

    public String strip() {
        return string.strip();
    }

    public String stripLeading() {
        return string.stripLeading();
    }

    public String stripTrailing() {
        return string.stripTrailing();
    }

    public boolean isBlank() {
        return string.isBlank();
    }

    public Stream<String> lines() {
        return string.lines();
    }

    public String indent(int n) {
        return string.indent(n);
    }

    public String stripIndent() {
        return string.stripIndent();
    }

    public String translateEscapes() {
        return string.translateEscapes();
    }

    public <R> R transform(Function<? super String, ? extends R> f) {
        return string.transform(f);
    }

    public IntStream chars() {
        return string.chars();
    }

    public IntStream codePoints() {
        return string.codePoints();
    }

    public char[] toCharArray() {
        return string.toCharArray();
    }

    public String formatted(Object... args) {
        return string.formatted(args);
    }

    public String intern() {
        return string.intern();
    }

    public String repeat(int count) {
        return string.repeat(count);
    }

    public Optional<String> describeConstable() {
        return string.describeConstable();
    }

    public String resolveConstantDesc(MethodHandles.Lookup lookup) {
        return string.resolveConstantDesc(lookup);
    }
}
